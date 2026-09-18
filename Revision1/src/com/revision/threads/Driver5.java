package com.revision.threads;

class Cook extends Thread{
	
	@Override
	public void run() {
		
		System.out.println("Food is being preparing......[" + Thread.currentThread().getName() + "]");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Food preparation is done......[" + Thread.currentThread().getName() + "]");
	}
}

class Waiter extends Thread{
	
	@Override
	public void run() {
		
		
		
		
		System.out.println("Waiter is serving the food......[" + Thread.currentThread().getName() + "]");
	}
}

public class Driver5 {
	
	public static void main(String[] args) throws InterruptedException
	{
		Thread.currentThread().setName("Waiter");
		
		System.out.println("waiter too the order.....[" + Thread.currentThread().getName() + "]");
		
		Cook t1 = new Cook();
		t1.setName("Cook");
		
		Waiter t2 = new Waiter();
		t2.setName("Waiter");
		
		t1.start();
		t1.join();
		
		
		t2.start();
		
		
	}
}
