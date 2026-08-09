package com.sreenu;

public class Driver {

	public static void main(String[] args) {
		
		IntCalc intCalc1 = IntCalc.getInstance(); // someone created
		
		IntCalc intCalc2 = IntCalc.getInstance(); // you
		
		IntCalc intCalc3 = IntCalc.getInstance(); // someone else created
		
		System.out.println(intCalc1 == intCalc2);

	}

}
