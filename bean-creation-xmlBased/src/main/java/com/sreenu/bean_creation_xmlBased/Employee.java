package com.sreenu.bean_creation_xmlBased;

public class Employee {
	
	private String firstName;
	private String lastName;
	private String email;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void doSomething() {
		
		System.out.println("FirstName is: " + firstName + " lastName is: " + lastName + " email is: " + email);
	}
	
}
