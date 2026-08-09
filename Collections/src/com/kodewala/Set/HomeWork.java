package com.kodewala.Set;

import java.util.*;

/*
 -> Here at 1 particular index if there will be collisions of more than 8 then it will
 	convert from linkedList to BalancedTree
->  
 */

class Payment {
	String name;

	public Payment(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return 12345;
	}
}

public class HomeWork {

	public static void main(String[] args) {
		
		Set<Payment> payment = new HashSet<Payment>();
		payment.add(new Payment("p1"));
		payment.add(new Payment("p1"));
		payment.add(new Payment("p1"));
		payment.add(new Payment("p1"));
		payment.add(new Payment("p1"));
		payment.add(new Payment("p1"));
		payment.add(new Payment("p1"));
		payment.add(new Payment("p1"));
		
		System.out.println(payment);
		payment.add(new Payment("p1"));
		payment.add(new Payment("p1"));
		System.out.println(payment);
		
	}

}
