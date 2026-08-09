package com.sreenu;

public class IntCalc {
	
	private static IntCalc intCalc;
	
	private IntCalc() {
		
	}
	
	public static  IntCalc getInstance() {
		
		if(intCalc == null) {
			System.out.println(" Creating object as it was null. first time object creation .....");
			intCalc = new IntCalc();
		}
		else {
			System.out.println("Object already created .... returing existing(which are already created by someone else");
		}
		
		return intCalc;
	}
}
