package com.task02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(PaymentConfig.class);
		
		OrderService bean = context.getBean("orderService", OrderService.class);
		System.out.println(bean);
	}
}
