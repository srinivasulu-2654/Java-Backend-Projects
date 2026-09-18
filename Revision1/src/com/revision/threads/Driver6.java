package com.revision.threads;

class Task {
	
	synchronized void printNumbers() throws InterruptedException {
		
		for(int i=0;i<5;i++)
		{
//			Thread.sleep(1000);
			wait(1000);
			System.out.println("Number: " +  Thread.currentThread().getName());
		}
	}
}

class PrinterThread extends Thread {
	
	Task task;
	
	public PrinterThread(Task task) {
		this.task=task;
	}
	
	@Override
	public void run() {
		try {
			task.printNumbers();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class Driver6 {
	
	public static void main(String[] args) {
		
		/* Task task1 = new Task();
		Task task2 = new Task();
		
		PrinterThread t1 = new PrinterThread(task1);
		PrinterThread t2 = new PrinterThread(task2); */
		
		Task sharedObject = new Task();
		PrinterThread t1 = new PrinterThread(sharedObject);
		PrinterThread t2 = new PrinterThread(sharedObject);
		
		t1.start();
		t2.start();
	}
}
