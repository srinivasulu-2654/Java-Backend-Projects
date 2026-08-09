package com.sreenu.test;

public class Driver {

	public static void main(String[] args) {
	
		Address address = new Address("8th street MCN","Chennai","TN","600097");
		
		// using constructor ..... (Mandatory and Immutable)
		
		Employee employee = new Employee("nitish", "yadav", "nitish.y@tcs.com", "Inc013232", address);
		
		// using setter to inject the Address object (Optional and mutable)
		
		Employee employee1 = new Employee("nitish", "yadav", "nitish.y@tcs.com", "Inc013232");
		employee1.setAdress(address);
		
		address = new Address("parllor street","BLR","KA","518422");
		
		employee1.setAdress(address);
		
		System.out.println();
	}

}
