package com.sreenu.bean_lifecyclePractice.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Payment {
	
	private String paymentRefNo;
	
	public Payment() {
		System.out.println("1.Bean instantiated");
	}

	public String getPaymentRefNo() {
		return paymentRefNo;
	}

	public void setPaymentRefNo(String paymentRefNo) {
		this.paymentRefNo = paymentRefNo;
		System.out.println("2.Dependency injected");
	}
	
	
	@PostConstruct
	public void init() {
		System.out.println("3. Bean initilaized");
	}
	
	@PreDestroy
	public void destory() {
		System.out.println("4.Destroying the object");
	}
}
