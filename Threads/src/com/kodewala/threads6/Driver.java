package com.kodewala.threads6;

/*
 -> Here 1 task should generate if even start first then it should execute first
 -> if odd should start first it should execute first
 -> so here by using "synchronized" -> it should complete 1 thread first and then it will go to other thread only
 	-> until it wont allow other thread
 	
 -> here if we create 2 different objects now it will run parellelly
 -> this condition is called as "Race Condition"
 -> To enter into synchronized block or method thread needs object lock
 */

class Task {
	
	synchronized void printNumbers() throws InterruptedException { 
		
		for(int i=0;i<20;i++)
		{
//			Thread.sleep(1000);
			wait(1000);
			System.out.println("Number : " + i + " " + Thread.currentThread().getName());
		}
	}
}

class PrinterThread extends Thread {
	Task task;

	public PrinterThread(Task task) {
		this.task = task;
	}
	
	@Override
	public void run() {
		try {
			task.printNumbers();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  // calling on sharedObject
	}
}

public class Driver {

	public static void main(String[] args) {
		
		// here sharing the same object
		
		Task sharedObject = new Task(); //one lock  --> if someone taken this lock from an object. remaining lock with task object will be 0
//		Task task1 = new Task(); // one lock
//		Task task2 = new Task(); // one lock
		
		PrinterThread t1 = new PrinterThread(sharedObject);
		t1.start();
		
//		Task task2 = new Task(); // user 2
		PrinterThread t2 = new PrinterThread(sharedObject);
		t2.start();
	}

}
