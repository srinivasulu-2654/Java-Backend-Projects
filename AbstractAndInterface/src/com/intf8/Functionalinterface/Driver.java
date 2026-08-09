package com.intf8.Functionalinterface;

public class Driver{

	public static void main(String[] args) {
		
		
		// here no need to give like this add(a,b) becuase only 1 method name right so no need to give method name
		ICalc cal = (a,b) -> {
			int sum = a + b;
			return sum;
		};
		int sum = cal.add(12,34);
		System.out.println(sum);

	}

//	@Override
//	public int add(int a, int b) {
//		
//		int sum = a + b;
//		return sum;
//	}

}
