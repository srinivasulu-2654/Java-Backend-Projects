package com.sreenu.test;

class BankAccount {
	
	private double balance;
	
	public BankAccount(double balance) {
		this.balance = balance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		
		if(amount>0) {
			balance += amount;
			System.out.println("Deposited money: " + amount);
		}
		else {
			System.out.println("Invalid amount");
		}
	}
	
	public void withdraw(double amount) {
		if(amount > 0) {
			balance -= amount;
			System.out.println("Withdrawn amount: " + amount);
		}
		else {
			System.out.println("Insufficient funds or invalid amount");
		}
	}
}

public class Banking {
	
	public static void main(String[] args) {
		BankAccount acc = new BankAccount(1000);
		acc.deposit(500);
		System.out.println(acc.getBalance());
	}
}
