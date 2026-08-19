package com.irctc.booking.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.irctc.booking.entity.BookingEntity;
import com.irctc.booking.entity.PaymentEntity;
import com.irctc.booking.exception.InsufficientBalanceException;
import com.irctc.booking.kafa.producer.service.KafkaService;
import com.irctc.booking.repository.BookingRepo;
import com.irctc.booking.repository.PaymentRepo;
import com.irctc.booking.request.BookingRequest;
import com.irctc.booking.response.BookingResponse;

import jakarta.transaction.Transactional;

@Service
public class BookingService {
	
	@Autowired
	BookingRepo bookingRepo;
	
	@Autowired
	PaymentRepo paymentRepo;
	
	@Autowired
	KafkaService kafkaService;
	
	public List<BookingResponse> getTickets(String userId, String pageNumber, String pageSize) {
		
		Pageable pageable = PageRequest.of(Integer.parseInt(pageNumber),Integer.parseInt(pageSize));
		
//		List<BookingEntity> tickets = bookingRepo.findByUserId(userId);
		
		Page<BookingEntity> tickets = bookingRepo.findAll(pageable); // pagination introduced here 
		
		List<BookingResponse> response = new ArrayList<BookingResponse>();
		
		for(BookingEntity be : tickets) {
			
			BookingResponse bookingResponse = new BookingResponse();
			
			bookingResponse.setPnrNumber(be.getPnrNumber());
			bookingResponse.setLocalDate(be.getDate());
			bookingResponse.setCoach(generateCoach("SL"));
			bookingResponse.setSeatNum(generateSeatNumber());
			bookingResponse.setBookingId(be.getBookingId());
			response.add(bookingResponse);
		}
		
		return response;
	}
	
	@Transactional
	public BookingResponse bookTicket(BookingRequest bookingRequest) {
		
		BookingEntity bookingEntity = new BookingEntity();
		
		bookingEntity.setFromStation(bookingRequest.getFromStation());
		bookingEntity.setToStation(bookingRequest.getToStation());
		bookingEntity.setName(bookingRequest.getName());
		bookingEntity.setAge(bookingRequest.getAge());
		bookingEntity.setCoachClass(bookingRequest.getCoachClass());
		bookingEntity.setDate(bookingRequest.getDate());
		bookingEntity.setGender(bookingRequest.getGender());
//		bookingEntity.setPnrNumber(generatePnr());
		bookingEntity.setUserId(bookingRequest.getUserId());
		bookingEntity.setStatus("BOOKING_INIT");
		
		//create a booking record - 1st query
		bookingEntity = bookingRepo.save(bookingEntity); // till here saved in db but down it got failed right -> so rollback happened
		
		// initiate a payment
		PaymentEntity paymentEntity = new PaymentEntity();
		
		paymentEntity.setAmount(1345);
		paymentEntity.setBookingId(bookingEntity.getBookingId());
		paymentEntity.setTransactionId("TXN12345");
		
		// here creating intentionally creating payment failure -> for @transactional
		
		/* try {
			String paymentFromPaymentGateway = null;
			paymentEntity.setPaymentStatus(paymentFromPaymentGateway.concat("some text...")); // intentionally failing
		} catch (Exception e) {
			
			e.printStackTrace();
			throw new InsufficientBalanceException("User does not have enough balance to book ticket");
		} */
	PaymentEntity paymentEntityResponse = paymentRepo.save(paymentEntity); // 2nd query
		
	BookingResponse bookingResponse = null;
		if(paymentEntityResponse.getPayementId() > 0) {
			
			bookingEntity.setPnrNumber(generatePnr()); // if payment created only generate the pnr number
			bookingEntity.setStatus("BOOKED");
			
			// update the booking record
			
			BookingEntity updatedRecord = bookingRepo.save(bookingEntity); // 3rd query
		
	
			bookingResponse = new BookingResponse();
		
			bookingResponse.setPnrNumber(updatedRecord.getPnrNumber());
			bookingResponse.setLocalDate(updatedRecord.getDate());
			bookingResponse.setCoach(generateCoach("SL"));
			bookingResponse.setSeatNum(generateSeatNumber());
			bookingResponse.setBookingId(updatedRecord.getBookingId());
			bookingResponse.setMessage("Successfully booked the ticket");
			
		}
		
		System.out.println("========== BEFORE KAFKA LOOP ==========");
		
		// handling Kafka produer 
		
		for(int i=0;i<500;i++) {
			
			// send events to kafka for notification
			String message = "This is test message and pnr is " + bookingResponse.getPnrNumber();
			kafkaService.publishMessage("irctc-booking", message);
			System.out.println("Event published to kafka......... " + message);
		}
		
		return bookingResponse;
	}
	
	private long generatePnr() {

	    long pnr = ThreadLocalRandom.current()
	            .nextLong(1_000_000_000L, 10_000_000_000L);

	    return pnr;
	}
	
	private String generateCoach(String coachClass) {

	    ThreadLocalRandom random = ThreadLocalRandom.current();

	    switch (coachClass.toUpperCase()) {

	        case "SL":
	            return "S" + random.nextInt(1, 13);   // S1 - S12

	        case "3A":
	            return "B" + random.nextInt(1, 9);    // B1 - B8

	        case "2A":
	            return "A" + random.nextInt(1, 5);    // A1 - A4

	        case "1A":
	            return "H" + random.nextInt(1, 3);    // H1 - H2

	        default:
	            return "GEN";
	    }
	}
	
	private int generateSeatNumber() {

	    int seat = ThreadLocalRandom.current().nextInt(10, 100);

	    return seat;
	}
}
