package com.sreenu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.sreenu.pojo.Employee;

@Configuration
@ComponentScan(basePackages = "com.sreenu")
public class SpringConfig {
	
	@Bean("emp1")
	@Primary
	public Employee createEmployee1() {
		Employee e = new Employee("kodewala1","Academy1","Engineering");
		return e;
	}
	
	@Bean("emp2")
	public Employee createEmployee2() {
		Employee e = new Employee("kodewala2","Academy2","Engineering");
		return e;
	}
}
