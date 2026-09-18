package com.sreenu.test;

class AccountNew{
	
	double balance;
	
	public AccountNew(double balance) {
		this.balance = balance;
	}
	
	public void showBalance() {
		System.out.println("Balance is : " + balance);
	}
}

class SavingsNewAccount extends Account {
	double interestRate;
	
	public SavingsNewAccount(double balance,double interestRate) {
		super(balance);
		this.interestRate=interestRate;
	}
	
	public void calculateInterest() {
		double interest = balance * interestRate / 100;
		System.out.println("Interest is : " + interest);
	}
}

class PremiumSavingsAccount extends SavingsNewAccount{
	
	double bonusRate;
	
	public PremiumSavingsAccount(double balance,double interestRate,double bonusRate) {
		super(balance,interestRate);
		this.bonusRate=bonusRate;
	}
	
	public void calulateBonus() {
		double bonus = balance * bonusRate / 100;
		System.out.println("Bonus is : " + bonus);
	}
}

public class MultiLevelInheritance {
	
	public static void main(String[] args) {
		
		PremiumSavingsAccount acct = new PremiumSavingsAccount(100000, 2, 5);
		acct.calculateInterest();
		acct.calulateBonus();
		acct.showBalance();
	}
}
