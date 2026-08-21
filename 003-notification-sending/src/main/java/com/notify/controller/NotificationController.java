package com.notify.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.notify.request.NotificationRequest;
import com.notify.service.NotificationService;

@RestController
public class NotificationController {
	
	@Autowired
	NotificationService notificationService;
	
	@PostMapping("/notification/send")
	public String pushNotification(@RequestBody NotificationRequest notificationRequest) {
		
		return notificationService.sendNotification(notificationRequest);
	}
}
