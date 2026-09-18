package com.sreenu.test;

abstract class Accountnew1{
	
	double balance;
	
	Accountnew1(double balance){
		this.balance = balance;
	}
	
	
	public void showBalance() {
		System.out.println("Balance is: " + balance);
	}
	
	abstract void calculateInterest1();
}

class SavingsAccountnew1 extends Accountnew1{
	
	double rateOfInterest;
	
	public SavingsAccountnew1(double balance,double rateOfInterest) {
		super(balance);
		this.rateOfInterest = rateOfInterest;
	}
	
	@Override
	public void calculateInterest1() {
		double interest = balance * rateOfInterest / 100;
		System.out.println("interest is : " + interest);
	}
}

class CurrentAccount extends Accountnew1 {
	
	public CurrentAccount(double balance) {
		super(balance);
	}
	
	@Override
	public void calculateInterest1() {
		System.out.println("There will be no interest for checking accounts");
	}
}

public class AbstractClass {
		
	public static void main(String[] args) {
		Accountnew1 savings = new SavingsAccountnew1(100000,2);
		savings.showBalance();
		savings.calculateInterest1();
		
		
		Accountnew1 current = new CurrentAccount(10000);
		current.calculateInterest1();
		current.showBalance();
	}
}
