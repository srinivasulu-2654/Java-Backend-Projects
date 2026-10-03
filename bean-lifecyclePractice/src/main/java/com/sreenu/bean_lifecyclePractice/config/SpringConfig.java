package com.sreenu.bean_lifecyclePractice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sreenu.bean_lifecyclePractice.bean.Payment;

@Configuration
public class SpringConfig {
	
	@Bean("payment")
	public Payment doPayment()
	{
		Payment payment = new Payment();
		payment.setPaymentRefNo("pay123");
		return payment;
	}
}
