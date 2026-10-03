package com.sreenu.singleton;

public class Driver {
	
	public static void main(String[] args) {
		
		Payment p1 = Payment.getInstance();
		
		Payment p2 = Payment.getInstance();
		
		Payment p3 = Payment.getInstance();
		
		System.out.println(p1==p3);
	}
}
