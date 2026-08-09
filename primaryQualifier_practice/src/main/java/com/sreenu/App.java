package com.sreenu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sreenu.beans.Employee;
import com.sreenu.config.SpringConfig;
import com.sreenu.service.EmployeService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        EmployeService emp = context.getBean(EmployeService.class);
        emp.printDetails();
    }
}
