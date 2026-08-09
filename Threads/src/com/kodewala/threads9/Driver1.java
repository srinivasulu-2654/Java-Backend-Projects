package com.kodewala.threads9;

class FirstThread1 extends Thread {
	
	@Override
	public void run() { // does not return anything ..... and not throw exception
		
		boolean status = sendEmail();
	}
	
	public boolean sendEmail() {
		
		//account created logic
		return true;
	}
}


public class Driver1 {

	public static void main(String[] args) {
		
		FirstThread1 t1 = new FirstThread1();
		t1.start();
		
		FirstThread1 t2 = new FirstThread1();
		t2.start();

	}

}
