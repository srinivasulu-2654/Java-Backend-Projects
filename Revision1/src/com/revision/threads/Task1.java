package com.revision.threads;

class PrintEvenNumber extends Thread {
	
	@Override
	public void run() {
		System.out.println("Printing even numbers.....");
		
		int cnt = 0;
		
		for(int i=1;i<=20;i++)
		{
			if(i%2==0) {
				
				System.out.println("Even number is: " + i + " " + Thread.currentThread().getName());
				
				cnt++;
				
				if(cnt==10) {
					System.out.println("Sending " + Thread.currentThread().getName() + " to sleeping state");
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println(Thread.currentThread().getName() + " resumed after sleep");
				}
			}
		}
		
		System.out.println(Thread.currentThread().getName() + " execution completed");
	}
}

class PrintOddNumbers extends Thread {
	
	@Override
	public void run() {
		
		System.out.println("Printing odd numbers....");
		
		int cnt = 0;
		
		for(int i=1;i<=20;i++) {
			
			if(i%2!=0) {
				System.out.println("Odd number is: " + i + " " + Thread.currentThread().getName());
				
				cnt++;
				if(cnt==10) {
					
					System.out.println("Sending " + Thread.currentThread().getName() + " to sleeping state");
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println(Thread.currentThread().getName() + " resumed after sleep");
				}
			}
		}
		
		System.out.println(Thread.currentThread().getName() + " execution done!!!!");
	}
}

public class Task1 {
	
	public static void main(String[] args) {
		
		PrintEvenNumber evenNum = new PrintEvenNumber();
		evenNum.setName("Even Thread");
		
		PrintOddNumbers oddNum = new PrintOddNumbers();
		oddNum.setName("Odd Thread");
		
		evenNum.start();
		oddNum.start();
	}
}
