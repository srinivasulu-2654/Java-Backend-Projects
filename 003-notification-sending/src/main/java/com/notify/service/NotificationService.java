package com.notify.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.notify.entity.NotificationEntity;
import com.notify.repo.NotificationRepo;
import com.notify.request.NotificationRequest;

@Service
public class NotificationService {
	
	@Autowired
	NotificationRepo notificationRepo;
	
	public String sendNotification(@RequestBody NotificationRequest notificationReq)
	{
		NotificationEntity notificationEntity = new NotificationEntity();
		
		notificationEntity.setBookingId(notificationReq.getBookingId());
		notificationEntity.setMessage(notificationReq.getMessage());
		notificationEntity.setStatus(notificationReq.getStatus());
		
		notificationRepo.save(notificationEntity);
		
		return notificationEntity.getMessage();
	}
}
