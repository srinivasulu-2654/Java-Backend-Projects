package com.kodewala.Set;

class Person2 {
	
	String firstName;
	String lastName;
	public Person2(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	// here we are overriding this becuase this will compare with content not with memory references
	
	@Override
	public boolean equals(Object obj2) {
		Person2 p = (Person2) obj2;
		return this.firstName.equals(p.firstName) & this.lastName.equals(p.lastName);
	}
	
	@Override
	public int hashCode() {
		return this.firstName.hashCode() + this.lastName.hashCode();
	}
}

public class Driver2 {

	public static void main(String[] args) {
		
		
		Person2 p1 = new Person2("Sreenu", "Polukanti");
		Person2 p2 = new Person2("Sreenu", "Polukanti");
		
		System.out.println(p1.equals(p2)); 
		System.out.println(p1.hashCode() + " and " + p2.hashCode());
	}

}
