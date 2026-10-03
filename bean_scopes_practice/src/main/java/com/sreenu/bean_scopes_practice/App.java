package com.sreenu.bean_scopes_practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sreenu.bean_scopes_practice.beans.Payment;
import com.sreenu.bean_scopes_practice.config.SpringConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext con = new AnnotationConfigApplicationContext(SpringConfig.class);
        Payment pay1 = (Payment) con.getBean("payment");
        System.out.println(pay1.getRefNo());
        
        Payment pay2 = (Payment) con.getBean("payment");
        System.out.println(pay2.getRefNo());
        
        System.out.println(pay1 == pay2);
    }
}
