package com.sreenu.test;

class Emp {
	String name;
	
	public Emp(String name) {
		this.name = name;
		System.out.println(name + " is an employee");
	}
}

class Manager extends Emp {
	
	String dept;
	
	public Manager(String name,String dept) {
		super(name);
		this.dept = dept;
		System.out.println(name + " is a manager of " + dept);
	}
}

public class Revision5 {
	public static void main(String[] args) {
		Manager m1 = new Manager("Ravi", "IT");
		
	}
}
