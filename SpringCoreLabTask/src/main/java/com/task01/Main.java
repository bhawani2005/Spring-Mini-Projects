package com.task01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(CompanyConfig.class);
		
		CompanyService bean = context.getBean("companyService", CompanyService.class);
		
		bean.displayDetails();
	}
}
