package com.day19.springCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/day19/springCore/application-context.xml");
		
		Student bean = context.getBean("student", Student.class);
		
		System.out.println(bean);
		bean.show();
	}
}
