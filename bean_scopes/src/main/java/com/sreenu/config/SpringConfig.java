package com.sreenu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.sreenu.beans.Payment;

@Configuration
public class SpringConfig {
	
	@Bean("payment")
	@Scope("prototype")
	public Payment doPayment() {
		
		Payment payment = new Payment();
		payment.setPaymentRefNo("Ref1234");
		return payment;
	}
}
