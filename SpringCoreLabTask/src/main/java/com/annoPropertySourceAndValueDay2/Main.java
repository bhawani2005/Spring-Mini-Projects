package com.annoPropertySourceAndValueDay2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/annoPropertySourceAndValueDay2/application-context.xml");
		
		/*
		 * Employee bean = context.getBean("employee", Employee.class);
		 * 
		 * System.out.println(bean);
		 */
		
		
		/*
		 * Product bean = context.getBean("product", Product.class);
		 * 
		 * System.out.println(bean);
		 */
		
		Account bean = context.getBean("account", Account.class);
		
		System.out.println(bean);
	}
}	
