package com.SpringCoreExam3;

import java.awt.print.Book;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.SpringCoreExam3");
		/*
		 * Order bean = context.getBean("order", Order.class); bean.pay();
		 */
		
		/*
		 * ShoppingOrder bean = context.getBean("shoppingOrder", ShoppingOrder.class);
		 * bean.deliver();
		 */
		
		/*
		 * BookService bean = context.getBean("bookService", BookService.class);
		 * bean.bookDetails();
		 */
		
		EnrollService bean = context.getBean("enrollService", EnrollService.class);
		bean.enroll();
	}
}
