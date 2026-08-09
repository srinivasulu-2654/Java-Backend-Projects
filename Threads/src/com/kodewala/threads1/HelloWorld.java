package com.kodewala.threads1;


public class HelloWorld {

	public static void main(String[] args) {
		
		// this thread is only responsible for to execute this main method only

		System.out.println("Who is exceuting this code ? " + Thread.currentThread().getName());
		
//		Thread.currentThread().setName("MyThread");
		
		System.out.println("Who is exceuting this code ? " + Thread.currentThread().getName());
		
		System.out.println("HelloWorld.main()");
		
		// someMethod() this method won't handle here in main() method until we should create the object of this
		
		HelloWorld helloWorld = new HelloWorld();
		helloWorld.someMethod();

	}
	
	public void someMethod() {
		System.out.println("Who is exceuting this code ? " + Thread.currentThread().getName());
		System.out.println("HelloWorld.someMethod()");
	}
	
	// here every work is done by 1 thread -> so it is called as "Single Thread"
	// based on requirement will create new threads -> called as "Multiple Threads" -> all are independent -> all will run parlelly

}
