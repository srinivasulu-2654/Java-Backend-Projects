package com.sreenu.test;


class Account {
	
	double balance;
	
	public Account(double balance) {
		this.balance = balance;
	}
	
	public void showBalance() {
		System.out.println("Balance is : " + balance);
	}
}

class SavingsAccount extends Account{
	
	double rateOfInterest;
	
	public SavingsAccount(double balance,double rateOfInterest) {
		super(balance);
		this.rateOfInterest = rateOfInterest;
	}
	
	public void calculateInterest() {
		double interest = balance * rateOfInterest / 100;
		System.out.println("interest is : " + interest);
	}
}

public class BankingSystem {

	public static void main(String[] args) {
		SavingsAccount acct = new SavingsAccount(100000, 2);
		acct.showBalance();
		acct.calculateInterest();
	}
}
