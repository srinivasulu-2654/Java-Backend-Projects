package com.sreenu.bean_scopes_practice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.sreenu.bean_scopes_practice.beans.Payment;

@Configuration
public class SpringConfig {
	
	@Bean("payment")
	@Scope("prototype")
//	@Scope("request")
	public Payment doPayment() {
		
		Payment p = new Payment();
		p.setRefNo("Pay12345");
		return p;
	}
}
