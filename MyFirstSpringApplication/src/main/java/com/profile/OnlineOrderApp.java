package com.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OnlineOrderApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		
		context.getEnvironment().setActiveProfiles("dev");
		context.register(PaymentConfigurationDev.class, PaymentConfigurationQa.class);
		context.refresh();
		
		PaymentService bean = context.getBean("paymentService", PaymentService.class);
		System.out.println(bean);
		bean.payment(5000);
		
	}
}
