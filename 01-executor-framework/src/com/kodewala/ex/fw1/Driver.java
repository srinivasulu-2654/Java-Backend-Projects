package com.kodewala.ex.fw1;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* class NotifyDelivery implements Runnable{

	@Override
	public void run() {
		
		System.out.println("NotifyDelivery.run().. START " + Thread.currentThread().getName());
		DeliveryService deliveryService = new DeliveryService();
		deliveryService.confirmDelivery();
		System.out.println("NotifyDelivery.run().. END " + Thread.currentThread().getName());
	}
	
} */

class NotifyDelivery implements Callable<String>{

	@Override
	public String call() throws InterruptedException{
		
		System.out.println("NotifyDelivery.run()..  " + Thread.currentThread().getName());
		DeliveryService deliveryService = new DeliveryService();
		deliveryService.confirmDelivery();
		Thread.sleep(3000);
		return "SUCCESS";
		
	}
}




public class Driver {
	
	// java 1.5
	// before java 1.5 -> we were creating threads manually -> deciding how many should create -> difficult task
	// No. of threads ? -> we don't know  -> Shouldn't use threads reuse
	// java introduced package called "java.util.concurrent" -> they have created framework called -> Executor framework
	// Framework means -> everytime no need to write the same code we can give that functionality
	// for this framework -> no need to bother about how many threads it required -> it will give automatically
	// pool means here -> it will having "number of threads"
	// there is dynamic pool also -> called cache/dynamic
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		// create the executor service
//		ExecutorService es =  Executors.newSingleThreadExecutor(); // executors will have only 1 thread
		
//		ExecutorService es =  Executors.newCachedThreadPool(); // thread will decided by exe framework -> not in developer control
		
		ExecutorService es =  Executors.newFixedThreadPool(5); //  want only fixed number of threads by exe
		
		for(int i=0;i<10;i++) {
			NotifyDelivery task = new NotifyDelivery();
//			es.execute(task);   -> this is for Runnable
			Future<String> response = es.submit(task);
			System.out.println("Waiting for the response....");
			System.out.println(response.get());
			System.out.println("got the response...");
		}	
		
		
		// shutdown the service
		es.shutdown();
	}


	}

