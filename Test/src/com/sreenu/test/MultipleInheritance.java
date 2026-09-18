package com.sreenu.test;


interface Accountnew {
	public void showBalance();
}

interface SavingsAccountnew {
	public void showBalance();
}

class PremiumAccount implements Accountnew, SavingsAccountnew {
	
	@Override
	public void showBalance() {
		System.out.println("Showing the balance from premiumAccount itself");
	}
}

public class MultipleInheritance {
	
	public static void main(String[] args) {
		
		PremiumAccount acct = new PremiumAccount();
		acct.showBalance();
	}
}
