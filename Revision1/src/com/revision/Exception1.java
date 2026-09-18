package com.revision;

public class Exception1 {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4};
		
		try {
			System.out.println(arr[5]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index ! Array size is of only length: " + arr.length);
			e.printStackTrace();
		}
		
		System.out.println("Program continues after the exception handling");
	}

}
