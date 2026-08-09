package com.kodewala.abstractinterface;

/*
 	-> here abstract will do the forcefully to implement the methods in the child class
 	-> thus the application wont get crash
 	-> here KYC is compulsory in each and every organization so if we dont put "abstract"
 		then it will become optional
 	-> we cannot create the object of abstract class because class itself not completed(incomplete) right
 	-> but abstract class will have constructor
 	-> object can't create in abstract class (becuase class itslef incomplete)
 	
 	-> why we 
 */

abstract class PaymentSystem { // abstract + non-abstract methods
	
	public abstract void pay();  // what ? 
	public abstract void doKYC(); // compulsory need to implement forcefully
	
	public void stopChecque() {
		System.out.println("PaymentSystem.stopCheque()");
	}
	
	public PaymentSystem() {
		super();
		System.out.println("Payment system constructor got exceuted");
	}
}

class HDFC extends PaymentSystem {
	
	
	@Override
	public void pay() {
		System.out.println("HDFC.pay()"); 
		// How? (here forcing to implement the methods otherwise application will collapse
	}
	
	public void doKYC() {
		System.out.println("HDFC.doKyc()");
	}
	
	HDFC(){
		super();
	}
}

public class abstractDriver1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HDFC payment = new HDFC();
		
	}

}
