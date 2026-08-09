package com.sreenu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sreenu.beans.Employee;
import com.sreenu.beans.Employee1;
import com.sreenu.beans.SpringConfig;

public class App 
{
    public static void main( String[] args )
    {
    	// constructor injection
    	
    	/*
        	ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        	Employee employee = (Employee) context.getBean("emp");
        	System.out.println(employee);
        	*/
    	
    	// setter injection
    	
    	
    	/* ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
    	Employee1 employee = (Employee1) context.getBean("emp");
    	System.out.println(employee); */
    	
    	// field injection
    	
    	
    	ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
    	Employee1 employee = (Employee1) context.getBean(Employee1.class);
    	System.out.println(employee);
    }
}
