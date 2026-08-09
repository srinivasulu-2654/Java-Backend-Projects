package com.kodewala.threads7;

/*
 -> here for example in synchronized method if there will be around 50 lines of code which is not calculating our code logic
 	-> then it will be slow down the performance right -> becuase in that synchonized block it will become single threaded on particular object
 	System.out.println("Some other logic .......... 50 lines of code..........."); // slow down the performance right(these are not be in single threaded)
 	-> so here that is not critical even 100 lines of code also it won't affect our logic -> but will slow down the performance right
 		-> Now, Synchronization will not the right way to do
 		-> There is another way called "Synchronized block" -> we can put the our critical code in synchronized block()
 		-> which is better synchronized method() or synchronized block()
 		-> Ans : synchronized block()
 		
 	-> So here what the method will be "static" method -> then there will be no object Lock
 	-> it will be "Class Lock"
 */

class BankAccount {

    int balance = 1000;

    public void withdraw(int amount) { 
    	
    	System.out.println(Thread.currentThread().getName() + " Some other logic .......... 50 lines of code..........."); // slow down the performance right(these are not be in sinlge threaded)
    	
    	synchronized(this) { // Only 1 thread will able to execute at a time

		        if (balance >= amount) {
		
		            System.out.println("Sreenu is doing " + Thread.currentThread().getName()
		                    + " is withdrawing Rs." + amount);
		
		            balance = balance - amount;
		
		            System.out.println("Remaining Balance = " + balance);
		
		        } else {
		            System.out.println(Thread.currentThread().getName()
		                    + " --> Insufficient Balance");
		        }
    	}
    }
    
    int getBalance() {
    	return balance;
    }
}

class Customer extends Thread {

    BankAccount account;

    public Customer(BankAccount account) {
        this.account = account;
    }

    @Override
    public void run() {

        account.withdraw(700);
    }
}

public class RaceConditionCode {

    public static void main(String[] args) {
    	
    	
    	// here same account 1 is Phonepe and 1 is GPay

        BankAccount account = new BankAccount(); // shared account belongs to Sreenu
        
        System.out.println("Sreenu's Initial Balance is: " + account.getBalance());

        Customer person1 = new Customer(account);
        person1.setName("Phonepay");

        Customer person2 = new Customer(account);
        person2.setName("Gpay");

        person1.start();
        person2.start();
    }
}
