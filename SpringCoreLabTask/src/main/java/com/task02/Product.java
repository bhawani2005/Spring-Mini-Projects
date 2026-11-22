package com.task02;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Product {

	@Value("${product.id}")
	private int productid;
	
	@Value("${product.name}")
	private String productName;
	
	@Value("${product.price}")
	private double price;
	
	public Product() {
		super();
	}

	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [productid=" + productid + ", productName=" + productName + ", price=" + price + "]";
	}
	
	
}
