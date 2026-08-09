package com.kodewala.threads.ex.fw1;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class EmailSender implements Callable<Boolean> {
	
	@Override
	public Boolean call() {
		
		System.out.println(Thread.currentThread().getName());
		return true;
	}
}

public class Driver {

	public static void main(String[] args) {
			
		ExecutorService es =  Executors.newFixedThreadPool(4); // this will be tell us how many threads will create
		
		EmailSender task = new EmailSender();
		es.submit(task); // so any of the 4 threads will execute this
	}  

}
