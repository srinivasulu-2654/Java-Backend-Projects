package com.kodewala.threads1;

class MyThread extends Thread {
	
	@Override
	public void run() {  // 0-> this is responsible for executing the task
		System.out.println("MyThread.run().....executing the task.....: " + Thread.currentThread().getName());
		Payment payment = new Payment();
		payment.doPaymemt();
	}
}

public class Driver {

	public static void main(String[] args) {
		
		System.out.println("HelloWorld.main() START: " + Thread.currentThread().getName());
		
		// here this will works parllelly -> we can't say this will work first that will work first -> you can't predict the order of exceution
		
		MyThread t1 = new MyThread(); // new thread created
		t1.setName("T1");
		t1.start(); // new thread started  ---> new Thread started ---> main thread + T1
		
		
		MyThread t2 = new MyThread(); // new thread created
		t2.setName("T2");
		t2.start(); // new thread started  ---> new Thread started ---> main thread + T2
		
		System.out.println("HelloWorld.main() END: " + Thread.currentThread().getName());
	

	}
	

}

class Payment {
	
	public void doPaymemt() {
		System.out.println("Payment.doPayment(): " + Thread.currentThread().getName());
	}
}
