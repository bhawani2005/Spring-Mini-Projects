package com.SpringJdbcDay01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		/*
		 * ApplicationContext context = new
		 * ClassPathXmlApplicationContext("com/SpringJdbcDay01/application-context.xml")
		 * ;
		 * 
		 * ProductDao bean = context.getBean("productDao", ProductDao.class);
		 * System.out.println("Product Count: "+bean.productCount());
		 */

		ApplicationContext context = new AnnotationConfigApplicationContext(ProductConfig.class);
		ProductDao bean = context.getBean("product", ProductDao.class);

		System.out.println("Product count: " + bean.getProductCount());
		System.out.println("Product Name: " + bean.getProductNameById());
	}
}
