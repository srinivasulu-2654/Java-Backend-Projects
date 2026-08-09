package com.kodewala.Set1;
import java.util.*;



public class Driver {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("Sreenu","Polu");
		Employee e2 = new Employee("Kasi","Kanti");
		Employee e3 = new Employee("Bunty","Chowdary");
		
		TreeSet<Employee> ts = new TreeSet<Employee>(new FirstNameComparator()); // explore this
		
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		
		for(Employee e : ts) {
			System.out.println(e.firstName + " and " + e.lastName);
		}
		
	}

}
