package com.sreenu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;

import com.sreenu.beans.Payment;

@Configuration
public class SpringConfig {
	
	@Bean("payment")
	@Scope("prototype")
	@Profile("test") // important very famous interview Question
	public Payment createPayment()
	{
		Payment payment = new Payment();
		payment.setPaymentId("Pay1234");
		return payment;
	}
}
