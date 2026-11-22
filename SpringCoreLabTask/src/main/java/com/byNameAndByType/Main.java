package com.byNameAndByType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/byNameAndByType/application-context.xml");
		
		Order bean = context.getBean("order", Order.class);
		
		System.out.println(bean);
	}
}
