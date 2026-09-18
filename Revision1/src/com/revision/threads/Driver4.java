package com.revision.threads;

class MyThread2 implements Runnable {

	@Override
	public void run() {
		
		System.out.println("MyThread2.run().... attending the kodewala classes at 9AM " );
		
		System.out.println("MyThread2.run()....");
		System.out.println("MyThread2.run()....");
		System.out.println("MyThread2.run()....");
	}
	
	
}

public class Driver4 {
	
	public static void main(String[] args) {
		
		MyThread2 thread = new MyThread2();
		
		Thread t1 = new Thread(thread);
		
		t1.start();
		
		t1.start();
	}
}
