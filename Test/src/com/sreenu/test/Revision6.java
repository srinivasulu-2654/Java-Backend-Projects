package com.sreenu.test;

interface Payment{
	void pay();
}

abstract class BankPayement implements Payment {
	
	
}


class CreditCardPayment extends BankPayement {
	
	@Override
	public void pay() {
		System.out.println("Amount is being paid by credit card");
	}
}

public class Revision6 {
	
	public static void main(String[] args) {
		
		BankPayement payment = new CreditCardPayment();
		payment.pay();
	}
}
