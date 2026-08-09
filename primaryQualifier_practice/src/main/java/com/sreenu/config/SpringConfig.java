package com.sreenu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.sreenu.beans.Employee;

@Component
@ComponentScan("com.sreenu")
public class SpringConfig {
	
	@Bean("emp1")
	public Employee printEmployee1() {
		Employee e = new Employee("cap1", "gemini1", "IT");
		return e;
	}
	
	@Bean("emp2")
	public Employee printEmployee2() {
		Employee e = new Employee("cap2", "gemini2", "IT");
		return e;
	}
}
