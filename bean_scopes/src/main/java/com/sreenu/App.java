package com.sreenu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sreenu.beans.Payment;
import com.sreenu.config.SpringConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Payment payment1 = (Payment) context.getBean("payment");
        System.out.println(payment1.getPaymentRefNo());
        
     
        Payment payment2 = (Payment) context.getBean("payment");
        System.out.println(payment2.getPaymentRefNo());
        
        System.out.println(payment1 == payment2);
        
    }
}
