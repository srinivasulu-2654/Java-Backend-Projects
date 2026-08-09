package com.kodewala.cf2;

import java.util.concurrent.CompletableFuture;

public class Driver {

	public static void main(String[] args) {
		
		// write a program to return the string in UPPERCASE
		
		CompletableFuture<String> cf = CompletableFuture.supplyAsync(() -> {
			
			String name = "Kodewala";
			
			return name;
			
		}).thenApply((n) -> n.toUpperCase());
		
		// thenApply -> it will execute with supplyAsync thread only
		// thenApplyAsync -> it will run with seperate thread now here it will create 2 threads other than main thread
		
		System.out.println("Response: " + cf.join());

	}

}
