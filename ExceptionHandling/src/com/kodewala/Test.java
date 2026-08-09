package com.kodewala;

public class Test {

	public static void main(String[] args) { // +ve ---> happy scenario in industry called
		// TODO Auto-generated method stub
		
		System.out.println("This is sample program - START");
		
		int amount = 100;
//		String name = "Bengaluru"; // proper X 10k / sec
		String name = null;
		
		System.out.println("amount: " + amount);
		
		try {
			
			System.out.println("name: " + name.length()); // NullPointerException
		}
		
		catch(NullPointerException e) {
			e.printStackTrace();
			System.out.println("String cannot be null to calculate the length");
		}
		
		System.out.println("This is end of program - END");
	}

}
