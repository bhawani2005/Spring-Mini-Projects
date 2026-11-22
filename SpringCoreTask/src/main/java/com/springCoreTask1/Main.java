package com.springCoreTask1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main 
{
    public static void main( String[] args )
    {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springCoreTask1/application-context.xml");
		ToyCar bean1 = context.getBean("toyCar1", ToyCar.class);
		ToyCar bean2 = context.getBean("toyCar2", ToyCar.class);

        System.out.println(bean1);
        System.out.println("-----------------------------------");
        System.out.println(bean2);

    }
}
