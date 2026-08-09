package com.kodewala.Exception5;

public class UserRegistration {
	
	public boolean registerUser(String _email) throws EmailAlreadyExistsException, NumberFormatException
	{
		String email = _email;
		
		// logic to check the Email..... with DB and if already available the return true
		
		boolean isEmailRegistered = true;
		
		if(isEmailRegistered) {
			throw new EmailAlreadyExistsException(" Email id " + email + " already registered");
			// new Person("test)
		}
		
		return true;
	}

}	
