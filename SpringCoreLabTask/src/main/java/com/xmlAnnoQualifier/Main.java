package com.xmlAnnoQualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/xmlAnnoQualifier/application-context.xml");
		
		/*
		 * FoodOrder bean = context.getBean("foodOrder", FoodOrder.class); bean.pay();
		 */
		
		/*
		 * PatientRecord bean = context.getBean("patientRecord", PatientRecord.class);
		 * bean.display();
		 */
		
		OnlineCourse bean = context.getBean("onlineCourse", OnlineCourse.class);
		bean.Display();
	}
}
