package com.kodewala.threads.ITC;

public class Driver {

	public static void main(String[] args) {
		
		Task task = new Task(); // shared object
		
		Producer p = new Producer(task);
		p.setName("producer");
		p.start();
		
		Consumer c = new Consumer(task);
		c.setName("consumer");
		c.start();
	}

}
