package com.kodewala.threads4;

class PrintNumbers extends Thread {
	
	public void run() { // RUNNING
		
		System.out.println("PrintNumber.run().....");
		
		for(int i=0;i<10;i++) {
			System.out.println("Number is " + i + " " + Thread.currentThread().getName());
			if(i==5) {
				System.out.println("Sending " + Thread.currentThread().getName() + " to sleeping/waiting state ");
				try {
					Thread.currentThread().sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.println(" sleep time over.....starting again executing.....");
			}
		}
	} // TERMINATE
}

public class Driver {

	public static void main(String[] args) {
		
		PrintNumbers number = new PrintNumbers(); // NEW
		number.start(); // RUNNABLE
//		number.run(); // only run by the main thread
	}

}
