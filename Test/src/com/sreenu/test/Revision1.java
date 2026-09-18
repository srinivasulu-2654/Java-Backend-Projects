package com.sreenu.test;

import java.util.Scanner;

public class Revision1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age: ");
		
		int age  = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter your full name: ");
		String fullName = sc.nextLine();
		
		System.out.println("Enter your favourite color: ");
		String colour = sc.next();
		
		
		System.out.println("Enter weight in kgs");
		double weight = sc.nextDouble();
		
		System.out.println("Full name is : " + fullName);
		
		System.out.println("Age entered is : " + age);
		
		System.out.println("color entered is : " + colour);
		
		System.out.println("Weight entered in kilograms: " + weight);
	}

}
