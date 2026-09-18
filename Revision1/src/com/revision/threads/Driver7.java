package com.revision.threads;

class BankAccount {
	
	int balance = 1000;
	
	public void withdraw(int amount) {
		
		System.out.println("Executing the 50 lines of code ......");
		
		synchronized (this) {
			
			if(amount <= balance) {
				System.out.println("Sreenu transfering amount from: " + Thread.currentThread().getName() + "amount is RS: " + amount);
				balance = balance-amount;
				System.out.println("Remaining balance: " + balance);
			}
			
			else {
				System.out.println(Thread.currentThread().getName() + " having insufficient balance");
			}
		}
	}
	
	int getBalance() {
		return balance;
	}
}

class Customer extends Thread{
	
	BankAccount bankAccount;
	
	public Customer(BankAccount bankAccount) {
		this.bankAccount=bankAccount;
	}
	
	@Override
	public void run() {
		bankAccount.withdraw(700);
	}
}

public class Driver7 {
	
	public static void main(String[] args) {
		
		BankAccount acc = new BankAccount();
		
		System.out.println("Getting intital balance from the user is : " + acc.getBalance());
		
		Customer p1 = new Customer(acc);
		Customer p2 = new Customer(acc);
		
		p1.setName("phonepay");
		p2.setName("Gpay");
		
		p1.start();
		p2.start();
		
	}
}
