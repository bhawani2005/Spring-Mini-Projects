package com.SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(ShppingConfig.class);
        
        ShoppingPayment bean = context.getBean("shoppingPayment", ShoppingPayment.class);
        bean.payment();
    }
}
