package com.Intf.kodewala;

interface OTTPlatforms {
	
	public void SignUp(String email,String userName,String password);
	public void login(String userName,String password);
	public void subscription(String plan);
	public void cancelSubscription(String userName);
	
}

class Hotstar implements OTTPlatforms {

	@Override
	public void SignUp(String email, String userName, String password) {
		System.out.println("Hotstar Signup with email : " + email + " and userName: " + userName);
	}

	@Override
	public void login(String userName, String password) {
		System.out.println("Hotstar Login with userName: " + userName + "and Password: " + password);
		
	}

	@Override
	public void subscription(String plan) {
		System.out.println("Hotstar Subscription is : " + plan);
	}

	@Override
	public void cancelSubscription(String userName) {
		System.out.println("Hotstar Cancel Subscription with userName: " + userName);
	}
	
}

class Netflix implements OTTPlatforms{

	@Override
	public void SignUp(String email, String userName, String password) {
		System.out.println("Netflix Signup with email : " + email + " and userName: " + userName);
	}

	@Override
	public void login(String userName, String password) {
		System.out.println("Netflix Login with userName: " + userName + "and Password: " + password);
		
	}

	@Override
	public void subscription(String plan) {
		System.out.println("Netflix Subscription is : " + plan);
	}

	@Override
	public void cancelSubscription(String userName) {
		System.out.println("Netflix Cancel Subscription with userName: " + userName);
	}
	
}

public class OTTProject {

	public static void main(String[] args) {
		
		OTTPlatforms hotstar = new Hotstar();
		hotstar.SignUp("abc@gmail.com", "Sreenu", "admin@123");
		hotstar.login("Sreenu", "Admin@123");
		hotstar.subscription("Monthly");
		hotstar.cancelSubscription("Sreenu");
		
		OTTPlatforms netflix = new Netflix();
		netflix.SignUp("abc@gmail.com", "Sreenu", "admin@123");
		netflix.login("Sreenu", "Admin@123");
		netflix.subscription("Monthly");
		netflix.cancelSubscription("Sreenu");
	}

}
