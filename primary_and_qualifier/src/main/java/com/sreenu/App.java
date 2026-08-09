package com.sreenu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sreenu.config.SpringConfig;
import com.sreenu.pojo.Employee;
import com.sreenu.service.EmployeeService;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
       EmployeeService empService =  context.getBean(EmployeeService.class);
       empService.printEmployeeDetails();
    }
}
