package com.sreenu.test;

public class Employee {
	
	private String firstName;
	private String lastName;
	private String email;
	private String employeeId;
	private Address address;
	
	public Employee(String firstName, String lastName, String email, String employeeId, Address address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.employeeId = employeeId;
		this.address = address;
	}

	public void setAdress(Address _address) {
		address = _address;
	}
	
	public Employee(String firstName,String lastName,String email,String employeeId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.employeeId = employeeId;
	}
}
