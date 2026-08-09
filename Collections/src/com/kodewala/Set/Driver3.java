package com.kodewala.Set;

import java.util.HashSet;
import java.util.Set;

/* 
 	-> here in EMployee we are adding duplicate otherwise it will break the hashing collection
 	-> What if i add employee class object to hashmap?
 	-> first we have to do override equal methods
 	-> Here what if i override only equals method not hashCode method -> "then hashing-based collection will break."
 	-> What if i override only equal method but not the hashcode and try to add custom object to hashing based collection
 		(HashSet, HashMap, LinkedHashSet, LinkedHashMap etc...)
 */

class Employeee {
	
	private String name;

	public Employeee(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		Employeee e = (Employeee)obj;
		return this.name.equals(e.name);
	}
	
	@Override
	public int hashCode() {
		return this.name.hashCode();
	}
	
}

public class Driver3 {

	public static void main(String[] args) {
		
		Set<String> cities = new HashSet<String>(); // default capactiy : 16
		
		cities.add("BLR");
		cities.add("CHN");
		cities.add("BLR");
		
		System.out.println(cities.size()); // return 2
		
		Set<Employeee> emp = new HashSet<Employeee>();
		
		Employeee e1 = new Employeee("ritesh");
		Employeee e2  = new Employeee("suresh");
		Employeee e3 = new Employeee("paramesh");
		Employeee e4 = new Employeee("ritesh");
		
		
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		
		System.out.println(emp.size()); // return 4
		System.out.println(e1.hashCode() + " and " + e4.hashCode() + " and e1 and e4 are the same? " + e1.equals(e4));

	}

}
