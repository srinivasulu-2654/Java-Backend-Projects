//package com.payment.service;
//
//import org.springframework.cloud.openfeign.FeignClient;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//
//import com.payment.request.NotificationRequest;
//
//@FeignClient(name = "003-notification-sending")
//public interface NotificationClient {
//	
//	@PostMapping("/notification/send")
//	public String sendNotification(@RequestBody NotificationRequest notificationRequest);
//}
