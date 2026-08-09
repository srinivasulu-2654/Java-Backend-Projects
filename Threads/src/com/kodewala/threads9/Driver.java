package com.kodewala.threads9;

class FirstThread extends Thread {
	
	@Override
	public void run() {
		System.out.println("FirstThread.run().... START " + Thread.currentThread().getName());
//		Thread.yield(); //  pause the current thread and give the chance to other thread.
		System.out.println("FirstThread.run().... END " + Thread.currentThread().getName());
	}
}

class SecondThread extends Thread {
	
	@Override
	public void run() {
		System.out.println("SecondThread.run().... " + Thread.currentThread().getName());
	}
}

public class Driver {

	public static void main(String[] args) {
		
		FirstThread t1 = new FirstThread();
		t1.start();
		
		SecondThread t2 = new SecondThread();
		t2.start();

	}

}
