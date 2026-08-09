package com.kodewala.threads.ex.fw1;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class EmailSender1 implements Callable<String> { // here it can return any type of object
	
	@Override
	public String call() {
		
		System.out.println(Thread.currentThread().getName());
		return "Failed ......";
	}
}

public class Driver1 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
			
		ExecutorService es =  Executors.newFixedThreadPool(5); // this will be tell us how many threads will create
		
		EmailSender1 task = new EmailSender1();
		
		for(int i=0;i<5;i++) {
			
			Future<String> response =  es.submit(task); // so any of the 4 threads will execute this
			System.out.println("Response from call() method is: " + response.get());
		}
		
		es.shutdown(); // so you threads are still waiting so that it can be reusable if we use this then it will terminate
		// so this thread or this class knows what call() method will do
	}  

}
