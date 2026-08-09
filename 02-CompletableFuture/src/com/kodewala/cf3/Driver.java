package com.kodewala.cf3;

import java.util.concurrent.CompletableFuture;

public class Driver {

	public static void main(String[] args) {
		
		CompletableFuture cf = CompletableFuture.supplyAsync(() -> {
			String name = "Kodewala";
			
			return name;
		}).thenAccept(a -> System.out.println(" Hello ")); // thenAccept didn't return anything it just reads the thing
		
		System.out.println(" Response: " + cf.join());

	}

}
