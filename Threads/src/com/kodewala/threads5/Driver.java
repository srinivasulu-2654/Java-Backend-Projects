package com.kodewala.threads5;

/*
 Waiter took Food order...[Waiter]
Waiter started serving Food...[Waiter]
Food is being preparing......[cook]
Food is prepared to serve.....[cook]

-> so here there won't make sense right -> becuase of there is not even having the meaning
-> to make the meaningful there is concept called "join" -> (t1.join();) -> so this is the solution	
-> here join(0) -> should wait forever and incase of greater than 0 then it will wait for certain time join(10000)
-> join(-100)  -> timeout cannot be negative right
-> sleep and wait can you output if you harcode the value -> but in real time it won't right we dont know the value right

 */

class Cooking extends Thread {
	
	@Override
	public void run() {
		System.out.println("Food is being preparing......["+Thread.currentThread().getName()+"]");
		try {
			sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Food preparation done.....["+Thread.currentThread().getName()+"]");
	}
}

public class Driver {

	public static void main(String[] args) throws InterruptedException {
		
		Thread.currentThread().setName("Waiter");
		System.out.println("Waiter took Food order...["+Thread.currentThread().getName()+"]");
		
		Cooking t1 = new Cooking();
		t1.setName("cook");
		t1.start();
		
		t1.join(); // here waiter thread will wait until food is cooked... (here if person is not responsing it will time off)
		
		System.out.println("Waiter started serving Food...["+Thread.currentThread().getName()+"]");
	}

}
