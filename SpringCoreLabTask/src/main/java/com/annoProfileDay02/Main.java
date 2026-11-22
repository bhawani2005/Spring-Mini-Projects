package com.annoProfileDay02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

//		context.getEnvironment().setActiveProfiles("upi");
//		context.register(PaymentConfig.class);
//		context.refresh();
//		
//		PaymentService bean = context.getBean("payment", PaymentService.class);
//		bean.pay();
		 
//		context.getEnvironment().setActiveProfiles("sms");
//		context.register(NotificationConfig.class); context.refresh();
//		 
//		NotificationService bean = context.getBean("notificationService",
//		NotificationService.class); bean.set();
		
		context.getEnvironment().setActiveProfiles("mysql");
		context.register(DatabaseConfig.class);
		context.refresh();
		
		DatabaseService bean = context.getBean("databaseService", DatabaseService.class);
		bean.service();
		 
	}
}
