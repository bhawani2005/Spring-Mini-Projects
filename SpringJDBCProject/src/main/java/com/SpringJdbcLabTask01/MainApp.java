package com.SpringJdbcLabTask01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(BookConfig.class);
		
		BookDao bean = context.getBean("bookDao", BookDao.class);
		System.out.println("Number Of Book : "+bean.findTotalNumberOfBooks());
		System.out.println("=============================================");
		
		System.out.println("Book Name is : "+bean.findBookNameById(102));
		System.out.println("=============================================");
		
		System.out.println("Book Details: ");
		System.out.println(bean.findCompleteBookDetails(102));
		System.out.println("=============================================");
		
	}
}
