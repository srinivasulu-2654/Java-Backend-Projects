package com.irctc.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.irctc.entity.BookingEntity;
import com.irctc.entity.PaymentEntity;
import com.irctc.exception.InsufficientBalanceException;
import com.irctc.repo.BookingRepo;
import com.irctc.repo.PaymentRepo;
import com.irctc.request.BookingRequest;
import com.irctc.response.BookingResponse;

import jakarta.transaction.Transactional;

@Service
public class BookingService {
	
	@Autowired
	BookingRepo bookingRepo;
	
	@Autowired
	PaymentRepo paymentRepo;
	
	public List<BookingResponse> getAllTcikets(String userId,String pageNumber,String pageSize)
	{
//		List<BookingEntity> tickets =  bookingRepo.findByUserId(userId);
		
		PageRequest pageable = PageRequest.of(Integer.parseInt(pageNumber),Integer.parseInt(pageSize));
		
		 Page<BookingEntity> tickets =  bookingRepo.findAll(pageable);
		
		List<BookingResponse> response = new ArrayList<BookingResponse>();
		
		for(BookingEntity ticket : tickets)
		{
			BookingResponse bookingResponse = new BookingResponse();
			bookingResponse.setPnrNumber(ticket.getPnrNumber());
			bookingResponse.setBookingId(ticket.getBookingId());
			bookingResponse.setSeatNumber(ticket.getSeatNum());
			bookingResponse.setStatus(ticket.getStatus());
			bookingResponse.setTravelClass(ticket.getTravelClass());
			bookingResponse.setTrainNumber(ticket.getTrainNumber());
			bookingResponse.setJourneyDate(ticket.getJourneyDate());
			bookingResponse.setFrom(ticket.getSource());
			bookingResponse.setTo(ticket.getDestination());
			
			response.add(bookingResponse);
		}
		
		return response;
	}
	
	@Transactional
	public BookingResponse bookTicket(BookingRequest bookingReq) {
		
		BookingEntity bookingEntity = new BookingEntity();
		
		bookingEntity.setPassengerName(bookingReq.getPassengerName());
		bookingEntity.setSource(bookingReq.getSource());
		bookingEntity.setDestination(bookingReq.getDestination());
		bookingEntity.setJourneyDate(bookingReq.getJourneyDate());
		bookingEntity.setTrainNumber(bookingReq.getTrainNumber());
//		bookingEntity.setPnrNumber(generatePnr());
		bookingEntity.setUserId(bookingReq.getUserId());
		bookingEntity.setStatus("BOOKIN_INTI");
		bookingEntity.setSeatNum("52-A");
		bookingEntity.setTravelClass("SL");
		
		BookingEntity response = bookingRepo.save(bookingEntity);
		
		PaymentEntity payment = new PaymentEntity();
		payment.setAmount(345.56);
		payment.setBookingId(response.getBookingId());
//		payment.setPaymentStatus("Failed");
		payment.setTransactionId("TXN12346");
		
		String paymentGateway = null;
		
		try {
			payment.setPaymentStatus(paymentGateway.concat("some text..."));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new InsufficientBalanceException("User didn't have sufficient balance");
		}
		
		PaymentEntity paymentReponse = paymentRepo.save(payment);
		
		BookingResponse bookingResponse = null;
		
		 if(paymentReponse.getPayment_id()>0)
		 {
			 bookingEntity.setPnrNumber(generatePnr());
			 bookingEntity.setStatus("BOOKED");
			 
			 BookingEntity updatedRecord = bookingRepo.save(bookingEntity);
			 
			 bookingResponse = new BookingResponse();
			 
			 	bookingResponse.setPnrNumber(updatedRecord.getPnrNumber());
				bookingResponse.setBookingId(response.getBookingId());
				bookingResponse.setSeatNumber(response.getSeatNum());
				bookingResponse.setStatus(updatedRecord.getStatus());
				bookingResponse.setTravelClass(response.getTravelClass());
				bookingResponse.setTrainNumber(response.getTrainNumber());
				bookingResponse.setJourneyDate(response.getJourneyDate());
				bookingResponse.setFrom(response.getSource());
				bookingResponse.setTo(response.getDestination());
			 
		 }
		
		

		return bookingResponse;
		
	}
	

	public String generatePnr() {
	    Random random = new Random();
	    return String.valueOf(1000000000L + random.nextLong(9000000000L));
	}
}
