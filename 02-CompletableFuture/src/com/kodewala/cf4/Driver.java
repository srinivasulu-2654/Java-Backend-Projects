package com.kodewala.cf4;

import java.util.concurrent.CompletableFuture;

public class Driver {

	public static void main(String[] args) {
		
		CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(() -> 10);
		
		CompletableFuture<Integer> future2 = CompletableFuture.supplyAsync(() -> 20);
		
		CompletableFuture<Integer> finalResult = future1.thenCombineAsync(future2, (n1,n2) -> n1+n2);
		
//		CompletableFuture.allOf(future1,future2); // this will tell you should complete all the above tasks it will block
		
		CompletableFuture.anyOf(future1,future2); // either of the task should complete then it move forward
		
		System.out.println("Task has been completed...");
		
		System.out.println("Final result is: " + finalResult.join());
	}

}
