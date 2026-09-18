package com.revision.set;

import java.util.HashSet;
import java.util.Set;

class Employee{
	
	String name;
	
	public Employee(String name) {
		this.name=name;
	}
	
	@Override
	public boolean equals(Object obj) {
		Employee e =(Employee) obj;
		return this.name.equals(e.name);
	}
	
	@Override
	public int hashCode() {
		return this.name.hashCode();
	}
}

public class Driver2 {
	
	public static void main(String[] args) {
		Set<String> cities = new HashSet<String>();
		cities.add("HYD");
		cities.add("CHN");
		cities.add("BLR");
		cities.add("HYD");
		
		System.out.println(cities.size());
		
		Set<Employee> employees = new HashSet<Employee>();
		
		Employee e1 = new Employee("govind");
		Employee e2 = new Employee("sreenu");
		Employee e3 = new Employee("aravind");
		Employee e4 = new Employee("sreenu");
		Employee e5 = new Employee("govind");
		
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		employees.add(e5);
		
		System.out.println(employees.size());
		
		System.out.println(e1.hashCode() + " " + e5.hashCode());
	}
}
