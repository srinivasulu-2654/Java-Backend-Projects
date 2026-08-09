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

class BankAccount1 {

   private static int balance = 1000;

    public static void withdraw(int amount) { 
    	
    	System.out.println(Thread.currentThread().getName() + " Some other logic .......... 50 lines of code..........."); // slow down the performance right(these are not be in sinlge threaded)
    	
    	synchronized(BankAccount1.class) { // Only 1 thread will able to execute at a time

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
    
   public static int getBalance() {
    	return balance;
    }
}

class Customer1 extends Thread {

    

    @Override
    public void run() {

    	BankAccount1.withdraw(700);
    }
}

public class RaceConditionCode1 {

    public static void main(String[] args) throws InterruptedException {
    	
        
        System.out.println("Sreenu's Initial Balance is: " + BankAccount1.getBalance());

        Customer1 person1 = new Customer1();
        person1.setName("Phonepay");

        Customer1 person2 = new Customer1();
        person2.setName("Gpay");

        person1.start();
        person2.start();
        
        // here .joim() and all not realted to synchronization we have just typed for to complete 1 process 
        
        person1.join();
        person2.join();
        
        System.out.println("Sreenu's Final Balance is: " + BankAccount1.getBalance());
    }
}
