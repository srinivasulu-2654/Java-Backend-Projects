package com.revision.exception1;

public class Exception1 {
	
	public static void main(String[] args) {
		System.out.println("Exception1.main().................Started");
		
		User user = new User();
		try {
			user.createUser();
		}catch(UserCreationFailedException exe) {
			exe.printStackTrace();
			System.out.println("Unable to creat the user please contance +91 00000000000000000000");
		}
		
		System.out.println("Exception1.main().................Ended");
		
	}
}

class Account{
	
	public void createAccount() throws FailedtoCreateAccountException{
		
		System.out.println("Account creation is started....");
		
		if(true) {
			throw new FailedtoCreateAccountException("unable to create the account");
		}
		
		System.out.println("Account creation is ended....");
	}
}

class User {
	public void createUser() throws UserCreationFailedException{
		System.out.println("User creation is started .....");
		Account acct = new Account();
		try {
			acct.createAccount();
		}catch(FailedtoCreateAccountException exe) {
			exe.printStackTrace();
			throw new UserCreationFailedException("Unable to creat the user");
		}
		System.out.println("User creation is ENDED");
	}
}
