package com.payment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.payment.entity.PaymentEntity;
import com.payment.repo.PaymentRepo;

@Service
public class PaymentService {
	
	@Autowired
	PaymentRepo paymentRepo;
	
	public String doPayment(String refId,String status,int amount)
	{
		PaymentEntity paymentEntity = new PaymentEntity();
		paymentEntity.setAmount(amount);
		paymentEntity.setStatus(status);
		paymentEntity.setRefId(refId);
		paymentRepo.save(paymentEntity);
		
		if(paymentEntity.getId() > 0) {
			return "SUCCESS";
		}
		else {
			return "FAILURE";
		}
	}
}
