package com.day01LabTask;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/day01LabTask/application-context.xml");
        
        Employee bean = context.getBean("employee", Employee.class);
        
        System.out.println(bean);
    }
}
