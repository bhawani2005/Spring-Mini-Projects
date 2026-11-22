package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.component.ProductService;
import com.configration.ProductConfig;

@SpringBootApplication
public class ECommerceSpringBootApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ProductConfig.class, args);
		
		ProductService bean = context.getBean("productService", ProductService.class);
		bean.displayProductDetails();
	}

}
