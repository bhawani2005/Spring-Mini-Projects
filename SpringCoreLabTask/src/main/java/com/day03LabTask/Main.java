package com.day03LabTask;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/day03LabTask/application-context.xml");
		
		MovieBooking bean = context.getBean("movieBooking1", MovieBooking.class);
		
		System.out.println(bean);

	}

}
