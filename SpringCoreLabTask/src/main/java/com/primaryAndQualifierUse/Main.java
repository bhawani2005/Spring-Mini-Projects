package com.primaryAndQualifierUse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/primaryAndQualifierUse/application-context.xml");
		
		RoomAllocationService bean = context.getBean("roomAllocationService", RoomAllocationService.class);
		bean.display();
	}
}
