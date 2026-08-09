package com.kodewala.Exception6;

public class Driver1 {

	public static void main(String[] args) {
		
		System.out.println("Driver.main() ... start");
		User user = new User();
		try {
			user.createUser();
		}catch(UserCreationException e) {
			e.printStackTrace();
			System.out.println("unable to create the user. pls contact support team pn +91 0000000000");
		}
		System.out.println("Driver.main() ... end");

	}

}

class Account {
	
	public void createAccount() throws FailedtoCreateAccountException{
		
		System.out.println("Account create ... start");
		
		if(true) {
			throw new FailedtoCreateAccountException("unable to create default account");
		}
		
		System.out.println("Account create ... end");
	}
}

class User {
	
	public void createUser() 
	
	{
		System.out.println("User create ... start");
		Account acct = new Account();
		try {
			acct.createAccount();
		} catch(FailedtoCreateAccountException e) {
			e.printStackTrace();
			throw new UserCreationException("unable to create the user");
		}
		System.out.println("User create ... end");
	}
}