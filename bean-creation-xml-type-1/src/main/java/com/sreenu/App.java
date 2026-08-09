package com.sreenu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sreenu.bean.Account;

public class App 
{
    public static void main( String[] args )
    {
    	String bean_def_file = "beans.xml";
    	
    	// Creating IOC Container - we are providing beans.xml(how beans to be created)
       ApplicationContext iocContainer = new ClassPathXmlApplicationContext(bean_def_file);
       
       // request the bean
       
       Account account = (Account) iocContainer.getBean("acc"); // this will return in Object type so we are down casting this 
       	
       // using the account bean
       account.doSomething();
    }
}
