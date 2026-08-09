package com.kodewala.threads.ITC;

public class Task {
	
	int number;
	boolean isDataAvailable = false;
	
	synchronized public void produce(int _num) throws InterruptedException {
		
		while(isDataAvailable == true) {
			System.out.println(Thread.currentThread().getName() + " is waiting.......");
			wait();
		}
		
		number = _num;
		System.out.println("Producing the data: " + number);
		isDataAvailable = true;
		notify();
	}
	
	synchronized public void consume() throws InterruptedException {
		while(isDataAvailable == false) {
			System.out.println(Thread.currentThread().getName() + " is waiting.......");
			wait();
		}
		System.out.println("Consuming the data: " + number);
		isDataAvailable = false;
		notify();
	}
}
