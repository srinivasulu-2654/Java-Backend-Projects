package com.kodewala.cf;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Driver {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		System.out.println("Driver.main()....START");
	CompletableFuture completableFuture = CompletableFuture.runAsync(() -> {
			System.out.println("This is from run async");	
		});
	
//	runAsync -> will not give you anything return type is void
	
//		System.out.println(completableFuture.get()); -> .get() is from Future 
//	  System.out.println(completableFuture.join()); // this is from CompleteableFuture
		System.out.println("Driver.main()....END");
	}

}
