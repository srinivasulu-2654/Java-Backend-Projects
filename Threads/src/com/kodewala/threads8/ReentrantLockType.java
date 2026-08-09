package com.kodewala.threads8;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

class BankAccount2 {

	   private static int balance = 1000;
	   
	   static ReentrantLock reentrantLock = new ReentrantLock();

	    public static void withdraw(int amount) throws InterruptedException { 
	    	
	    	System.out.println(Thread.currentThread().getName() + " Some other logic .......... 50 lines of code..........."); // slow down the performance right(these are not be in sinlge threaded)
	    	
//	    	reentrantLock.lock(); // sync started -> now developer can have to control the lock and unlock -> to prevent "deadLock"
	    	
	    boolean lockStatus = reentrantLock.tryLock(2000,TimeUnit.MILLISECONDS);
	    System.out.println("BankAccount().withdraw() " + lockStatus);

			        if (balance >= amount) {
			
			            System.out.println("Sreenu is doing " + Thread.currentThread().getName()
			                    + " is withdrawing Rs." + amount);
			
			            balance = balance - amount;
			
			            System.out.println("Remaining Balance = " + balance);
			
			        } else {
			            System.out.println(Thread.currentThread().getName()
			                    + " --> Insufficient Balance");
			        }
			        
			        reentrantLock.unlock();   // here if using .tryLock() then the other thread will occupy after some time 
	    	}
	    
	    
	   public static int getBalance() {
	    	return balance;
	    }
	}

	class Customer1 extends Thread {

	    

	    @Override
	    public void run() {

	    	try {
				BankAccount2.withdraw(700);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	}

	public class ReentrantLockType {

	    public static void main(String[] args) throws InterruptedException {
	    	
	        
	        System.out.println("Sreenu's Initial Balance is: " + BankAccount2.getBalance());

	        Customer1 person1 = new Customer1();
	        person1.setName("Phonepay");

	        Customer1 person2 = new Customer1();
	        person2.setName("Gpay");

	        person1.start();
	        person2.start();
	        
	        // here .joim() and all not realted to synchronization we have just typed for to complete 1 process 
	        
	        person1.join();
	        person2.join();
	        
	        System.out.println("Sreenu's Final Balance is: " + BankAccount2.getBalance());
	    }
	}

