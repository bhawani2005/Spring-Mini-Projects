package com.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("productService")
@Data
public class ProductService {

	@Autowired
	private Product product;
	
	public void displayProductDetails() {
		System.out.println("========== PRODUCT DETAILS ==========");
		System.out.println();
		System.out.println("Product ID          : "+product.getId());
		System.out.println("Product Name        : "+product.getName());
		System.out.println("Product Category    : "+product.getCategory());
		System.out.println("Product Brand       : "+product.getBrand());
		System.out.println("Product Price       : "+product.getPrice());
		System.out.println("Availability        : "+product.getAvailability());
		System.out.println();
		System.out.println("======================================");
	}
}
