package com.sreenu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.sreenu.beans.Employee;

@Component
public class EmployeService {
	
	@Autowired
	@Qualifier("emp2")
	public Employee employee;
	
	public void printDetails()
	{
		employee.display();
	}
}
