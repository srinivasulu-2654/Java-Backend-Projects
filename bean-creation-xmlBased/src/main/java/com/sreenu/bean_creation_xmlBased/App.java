package com.sreenu.bean_creation_xmlBased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String bean_def_file = "beans.xml";
        
        ApplicationContext iocContainer = new ClassPathXmlApplicationContext(bean_def_file);
        
        Employee emp = (Employee) iocContainer.getBean("EmpObj");
        
        emp.doSomething();
    }
}
