package com.revision.threads;

class MyThread extends Thread{
	
	@Override
	public void run() {
		System.out.println("MyThread.main()::::: " + Thread.currentThread().getName());
		Payment payment = new Payment();
		payment.doPayment();
	}
}

class Payment{
	
	public void doPayment() {
		System.out.println("Payment.doPayment(): " + Thread.currentThread().getName());
	}
}

public class Driver2 {
	
	public static void main(String[] args) {
		
		System.out.println("Main Thread start: " + Thread.currentThread().getName());
		
		MyThread t1 = new MyThread();
		t1.setName("T1");
		t1.start();
		
		MyThread t2 = new MyThread();
		t2.setName("T2");
		t2.start();
		
		System.out.println("Main Thread end: " + Thread.currentThread().getName());
	}
}

