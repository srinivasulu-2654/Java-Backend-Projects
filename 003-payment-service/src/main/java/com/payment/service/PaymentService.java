package com.payment.service;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service;

import com.payment.entity.PaymentEntity;
import com.payment.repo.PaymentRepo;
import com.payment.request.NotificationRequest;

@Service
public class PaymentService {
	
	@Autowired
	PaymentRepo paymentRepo;
	
//	@Autowired
//	NotificationClient notificationClient;
	
	public String doPayment(String refId,String status,int amount)
	{
		PaymentEntity paymentEntity = new PaymentEntity();
		paymentEntity.setAmount(amount);
		paymentEntity.setStatus(status);
		paymentEntity.setRefId(refId);
		paymentRepo.save(paymentEntity);
		
		
		if("PAID".equals(paymentEntity.getStatus())) {
			
			NotificationRequest notificationReq = new NotificationRequest();
			
			notificationReq.setBookingId("Book123");
			notificationReq.setMessage("Ticket has been successfully booked");
			notificationReq.setStatus("BOOKED");
			
//			notificationClient.sendNotification(notificationReq);
			
			return "Payment successful and ticket booked successfully";
		}
		
		else {
			NotificationRequest notificationReq = new NotificationRequest();
			
			notificationReq.setBookingId("Book1236");
			notificationReq.setMessage("Ticket booking failed");
			notificationReq.setStatus("FAILED");
			
//			notificationClient.sendNotification(notificationReq);
			
			return "Payment failed and ticket booked failed";
		}
		
		/* if(paymentEntity.getId() > 0) {
			return "SUCCESS";
		}
		else {
			return "FAILURE";
		} */
	}
}
