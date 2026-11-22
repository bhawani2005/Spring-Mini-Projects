package com.annoProfile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		
//		context.getEnvironment().setActiveProfiles("test");
//		context.register(PaymentConfigProd.class, PaymentConfigTest.class);
//		context.refresh();
//		
//		PaymentService bean = context.getBean("paymentService", PaymentService.class);
//		bean.pay();
		
		context.getEnvironment().setActiveProfiles("prod");
		context.register(DevDatabaseConfig.class, ProdDatabaseConfig.class);
		context.refresh();
		
		DatabaseService bean = context.getBean("databaseService", DatabaseService.class);
		bean.connection();
	}
}
