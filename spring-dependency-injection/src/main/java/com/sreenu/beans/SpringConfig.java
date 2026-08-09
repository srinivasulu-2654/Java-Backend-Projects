package com.sreenu.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.sreenu.beans")
public class SpringConfig {
	
	// Constructor injection 
	
	/* @Bean("add")
	public Address createAddress() {
		Address address = new Address("8th street", "8th MCN Nagar", "CHN", "TN", "600097");
		return address;
	}
	
	@Bean("emp")
	public Employee createEmployee() {
		Employee employee = new Employee("Kodewala", "Academy", createAddress()); // constructor based injection
		return employee;
	} */
	
	// setter injection
	
	/* @Bean("add")
	public Address1 createAddress() {
		Address1 address1 = new Address1("8th street", "8th MCN Nagar", "CHN", "TN", "600097");
		return address1;
	}
	
	@Bean("emp")
	public Employee1 createEmployee() {
		Employee1 employee1 = new Employee1();
		employee1.setFirstName("Kodewala");
		employee1.setLastName("Kodewala");
//		employee1.setAddress(createAddress()); // injection happening -- setter method (optional)
		return employee1;
	} */
	
	// field injection
	
	

}
