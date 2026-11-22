package com.annotationPropertySourceAndValue;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/annotationPropertySourceAndValue/application-context.xml");
		
		MobilePhone bean = context.getBean("mobilePhone", MobilePhone.class);
		
		System.out.println(bean);
	}
}
