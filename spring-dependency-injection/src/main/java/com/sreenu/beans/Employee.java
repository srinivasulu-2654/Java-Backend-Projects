package com.sreenu.beans;

public class Employee {
	
	private String firstName;
	private String lastName;
	private Address address;
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + "]";
	}
	public Employee(String firstName, String lastName, Address address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}
	
	
	
	
}
