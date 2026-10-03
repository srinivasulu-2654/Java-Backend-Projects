package com.sreenu.singleton;

public class Payment {
	
	private static Payment payment;
	
	private Payment() {
		
	}
	
	public static Payment getInstance() {
		
		if(payment == null) {
			System.out.println("First time creating the object...");
			payment = new Payment();
		}
		else {
			System.out.println("Object creation has been already done");
		}
		
		return payment;
	}

}
