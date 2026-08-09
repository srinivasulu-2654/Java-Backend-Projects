package com.kodewala.Exception1;

public class Driver { // use ctrl + shift + F --> format the code

	public static void main(String[] args) { 
		
		System.out.println("Driver.main() --- STARTED");
		
		Order order = new Order();
		order.doSomething();
		
		System.out.println("Driver.main() ---- END");
	}

}
