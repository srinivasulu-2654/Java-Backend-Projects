package com.sreenu.payment.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sreenu.payment.pojo.Payment;


// source of all the bean definition (equals to) --> <beans> .... </beans>
@Configuration
public class SpringConfig {
	
	@Bean  // define the bean ----> <bean> .... </bean>
	public Payment createPayment() {
		
		// here id will be by default method name only ---> "createPayment()"
		// or else you can create the bean id like this ---> @Bean("pay1")
		
		Payment payment = new Payment();
		payment.setPaymentRefNo(12345);
		payment.setStatus("PAID");
		
		return payment;
	}
	
	@Bean("pay1")  // define the bean ----> <bean> .... </bean>
	public Payment createPayment2() {
		
		// here id will be by default method name only ---> "createPayment()"
		// or else you can create the bean id like this ---> @Bean("pay1")
		
		Payment payment = new Payment();
		payment.setPaymentRefNo(45678);
		payment.setStatus("HOLD");
		
		return payment;
	}
}
