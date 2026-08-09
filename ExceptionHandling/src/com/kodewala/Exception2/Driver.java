package com.kodewala.Exception2;

public class Driver {

	public static void main(String[] args) {
		
		String name = "";
		
		System.out.println(name.length()); // compiler is not forcing -> unchecked exception
		
		
		// checked exception
		
		try {
			Class.forName("com.kodewala.Driver1111");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // forcing to handle it coz ClassNotFoundation is checked exception
	} 

}
