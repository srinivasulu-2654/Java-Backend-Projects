package com.revision.set;

class Person {
	String firstName;
	String lastName;
	
	public Person(String firstName,String lastName) {
		this.firstName=firstName;
		this.lastName=lastName;
	}
	
	@Override
	public boolean equals(Object obj) {
		Person p = (Person) obj;
		return this.firstName.equals(p.firstName) && this.lastName.equals(p.lastName);
	}
	
	@Override
	public int hashCode() {
		return this.firstName.hashCode() + this.lastName.hashCode();
	}
}

public class Driver1 {
	
	public static void main(String[] args) {
		
		Person p1 = new Person("Sreenu", "polukanti");
		Person p2 = new Person("Sreenu", "polukanti");
		
		System.out.println(p1.equals(p2));
		System.out.println(p1.hashCode() + " " + p2.hashCode());
	}
}
