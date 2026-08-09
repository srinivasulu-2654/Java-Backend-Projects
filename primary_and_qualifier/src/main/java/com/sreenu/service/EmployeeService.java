package com.sreenu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.sreenu.pojo.Employee;

@Component
public class EmployeeService {
	
	@Autowired
//	@Qualifier("emp1")
	private Employee employee;
	
	public void printEmployeeDetails() {
		employee.display();
	}
}
