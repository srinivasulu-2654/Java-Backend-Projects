package com.kodewala.Exception5;



public class Driver {
	
	public static void main(String[] args) {
		
		System.out.println("started the Driver.main()");
		
		String email = args[0];
		
		UserRegistration reg = new UserRegistration();
		
		try {
			reg.registerUser(email);
		} catch(EmailAlreadyExistsException e)
		{
			e.printStackTrace();
			System.out.println("Email is already registered. Pls connect with suppport team...");
		}
	}

}
