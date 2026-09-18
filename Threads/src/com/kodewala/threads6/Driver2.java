package com.kodewala.threads6;

/* 
 
 	-> This code is seriously focusing on (multiple thread accessing the same data) 
 
 */

class Banking {
	
	int balance = 1000;
	
	public void withdraw(int amount) {
		
		System.out.println(Thread.currentThread().getName() + " checking the balance.... " + balance);
		
		if(balance >= amount) {
			
			System.out.println(Thread.currentThread().getName() + " balance is sufficient to withdraw");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			balance = balance - amount;
			
			System.out.println(Thread.currentThread().getName() + "withdraw " + amount);
			
			System.out.println(Thread.currentThread().getName() + "balance " + balance);
		}
	}
}

public class Driver2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		Banking banking = new Banking();
		
		Thread t1 = new Thread(() -> {
			banking.withdraw(700);
		});
		
		Thread t2 = new Thread(() -> {
			banking.withdraw(700);
		});
		
		t1.setName("T1");
		t2.setName("T2");
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
	}
}
