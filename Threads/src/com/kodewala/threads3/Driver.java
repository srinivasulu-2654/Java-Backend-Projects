package com.kodewala.threads3;

class MyThread implements Runnable {

	@Override
	public void run() { // RUNNING STATE
		
		System.out.println("MyThread.run().....attending the kodewala classes --- STARTED at 9 AM");
		System.out.println("MyThread.run().....");
		System.out.println("MyThread.run().....");
		System.out.println("MyThread.run().....");
		// T1(student) can go to sleep/wait/pause state (30 mins) ----> WAITING STATE	
		// Once waiting is over, T1 will move to RUNNABLE ---> CPU gives time to T1 ---> RUNNING STATE (here first RUNNABLE state then only RUNNING)
		System.out.println("MyThread.run().....");
		System.out.println("MyThread.run().....");
		
		
		System.out.println("MyThread.run().....attending the kodewala classes --- ENDED at 6 PM");
		
	} // Once run method is completed, your thread T1 is terminated / DEAD
	
}

public class Driver {

	public static void main(String[] args) {
		
		
		// here we won't get functionalities because it is Runnable right having only 1 Abstract method
		
		MyThread myThread = new MyThread(); 
		
		// so we need to create here thread in constructor we have to pass myThread
		Thread t1 = new Thread(myThread); // New Born (Thread object created)
		t1.start(); // Threaded moved from New born to RUNNABLE -> Registered new Thread -> i.e. capable to run
		// -> once CPU allows thread t1 to run  -> then moves to Running state
		//t1.start(); // if again restart the thread it will give the exception "IllegalThreadStateException"
	}

}
