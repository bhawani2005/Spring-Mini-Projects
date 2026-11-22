package com.annoQualifierAndAutowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/annoQualifierAndAutowired/application-context.xml");
		
		/*
		 * OrderService bean = context.getBean("orderService", OrderService.class);
		 * 
		 * bean.getPaymentService().makePayment();
		 */
		
		NotificationManager bean = context.getBean("notificationManager", NotificationManager.class);
		bean.getNotificationService().sendNotification();
	}
}
