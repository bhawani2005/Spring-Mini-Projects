package com.JavaConfigValueInject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		Player bean1 = context.getBean("player1", Player.class);
		System.out.println(bean1);
		
		Player bean2 = context.getBean("player2", Player.class);
		System.out.println(bean2);
	}
}
