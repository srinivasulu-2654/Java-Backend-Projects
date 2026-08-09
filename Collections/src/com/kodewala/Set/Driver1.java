package com.kodewala.Set;

class Person1 {
	
	private String name;
	
	Person1(String name){
		super();
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return 123454321;
	}
}

public class Driver1 {

	public static void main(String[] args) {
		
		// Contract #1: If 2 objects are equal then hash code must be the same
		
		String s1 = "Kodewala";
		String s2 = "Kodewala";
		
		System.out.println(s1.hashCode() + " and " + s2.hashCode());
		
		
		// Contract #2: If 2 objects return the same hashCode, objects may or may not be equal
		// but i will force and return the same hashCode i will override it
		Person1 p1 = new Person1("sreenu");
//		Person1 p2 = new Person1("Vijaya");
		Person1 p2 = new Person1("sreenu");
		
		System.out.println(p1.hashCode() + " and  " + p2.hashCode() + " is p1 and p2 equal? " + p1.equals(p2));

	}

}
