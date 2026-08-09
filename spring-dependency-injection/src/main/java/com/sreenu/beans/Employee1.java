package com.sreenu.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee1 {
	
	@Value("sreenu")
	private String firstName;
	@Value("Polu")
	private String lastName;
	
	
	// filed injection ......
	
	@Autowired
	private Address1 address1;
	

	
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address1 + "]";
	}

	
}
