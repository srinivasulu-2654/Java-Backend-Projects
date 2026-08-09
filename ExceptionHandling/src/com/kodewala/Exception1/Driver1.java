package com.kodewala.Exception1;

// this will cause the "java.lang.StackOverflowError"

public class Driver1 {

	public static void main(String[] args) {
		
		Driver1 d = new Driver1();
		d.m1();
		

	}
	
	public void m1() {
		System.out.println("Driver1.m1()");
		m2();
	}
	
	public void m2() {
		System.out.println("Driver1.m2()");
		m1();
	}

}
