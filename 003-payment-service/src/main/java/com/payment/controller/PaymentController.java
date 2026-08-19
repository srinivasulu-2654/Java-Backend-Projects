package com.payment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.payment.service.PaymentService;

@RestController
public class PaymentController {
	
	@Autowired
	PaymentService paymentService;
	
	@PostMapping("/pay/{amount}")
	public String makePayment(@PathVariable int amount)
	{
		return paymentService.doPayment("PAY123", "PAID", amount);
	}
}
