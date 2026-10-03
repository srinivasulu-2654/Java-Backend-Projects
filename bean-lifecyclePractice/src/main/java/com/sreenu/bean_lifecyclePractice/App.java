package com.sreenu.bean_lifecyclePractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sreenu.bean_lifecyclePractice.bean.Payment;
import com.sreenu.bean_lifecyclePractice.config.SpringConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
       Payment payment1 =  (Payment) context.getBean("payment");
       System.out.println(payment1.getPaymentRefNo());
       payment1.destory();
    }
}
