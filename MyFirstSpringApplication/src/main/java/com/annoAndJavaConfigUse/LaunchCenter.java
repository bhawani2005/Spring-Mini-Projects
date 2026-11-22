package com.annoAndJavaConfigUse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LaunchCenter {
	public static void main(String[] args) {
		// ApplicationContext context = new
		// ClassPathXmlApplicationContext("com/annoAndJavaConfigUse/application-context.xml");

		// ApplicationContext context = new
		// AnnotationConfigApplicationContext(JavaConfig.class);

		ApplicationContext context = new 
				AnnotationConfigApplicationContext(JavaConfig.class);

		Rocket bean = context.getBean("rocket", Rocket.class);

		bean.launch();
	}
}
