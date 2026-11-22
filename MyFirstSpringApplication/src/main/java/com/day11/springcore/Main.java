package com.day11.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/day11/springcore/application-context.xml");
		
		University bean = context.getBean("university", University.class);
		System.out.println(bean);
		
	}

}
