package com.sreenu.payment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sreenu.payment.config.SpringConfig;
import com.sreenu.payment.pojo.Payment;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        
        Payment payment = (Payment) context.getBean("createPayment");
        
        payment.printPaymentDetails();
    }
}
