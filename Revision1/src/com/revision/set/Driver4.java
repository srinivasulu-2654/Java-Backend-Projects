package com.revision.set;

import java.util.TreeSet;

class Employee1 implements Comparable<Employee1>{
	String name;
	int salary;
	
	public Employee1(String name,int salary) {
		this.name=name;
		this.salary=salary;
	}
	
	public int compareTo(Employee1 obj) {
		return this.salary - obj.salary;
	}
}

public class Driver4 {
	
	public static void main(String[] args) {
		
		TreeSet<Employee1> ts = new TreeSet<Employee1>();
		
		Employee1 e1 = new Employee1("sreenu", 100);
		Employee1 e2 = new Employee1("ravi", 60);
		Employee1 e3 = new Employee1("govind", 500);
		Employee1 e4 = new Employee1("aravind", 20);
		Employee1 e5 = new Employee1("lakshmi", 120);
		Employee1 e6 = new Employee1("lakshmi", 172);
		
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		ts.add(e5);
		ts.add(e6);
		
		System.out.println(ts);
		
		for(Employee1 emp : ts) {
			System.out.println(emp.name + " and " + emp.salary);
		}
	}
}
