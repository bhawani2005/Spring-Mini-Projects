package com.notificationServiceFeatures;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/notificationServiceFeatures/application-context.xml");

		NotificationService bean = context.getBean("service", NotificationService.class);

		System.out.println(bean);

		System.out.println("------------------------------");

		System.out.println("Services Are: ");
		bean.getNotificationTypeService().stream().forEach(System.out::println);

		System.out.println("------------------------------");

		System.out.println("Regions Are: ");
		bean.getServiceRegions().stream().forEach(System.out::println);

		System.out.println("------------------------------");

		
		System.out.println("Service Providers Are: ");
		bean.getNotificationProvider().forEach((key, value) -> System.out.println(key + "----------" + value));
		
		System.out.println("------------------------------");
		
		System.out.println("Basic Configration: ");
		bean.getBasicConfigProperties().forEach((key, value) -> System.out.println(key +"--------"+value));
	}
}
