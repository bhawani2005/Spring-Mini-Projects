package com.SpringJdbcDay02;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ProductConfig.class);
		
		ProductDao bean = context.getBean("productDao", ProductDao.class);
		ProductBo productBo = bean.getProductById(102);
		System.out.println(productBo);
		
		List<ProductBo> allProduct = bean.getAllProduct();
		allProduct.forEach(System.out::println);
	}
}
