package com.annoPropertySourceAndValueDay2;

import org.springframework.beans.factory.annotation.Value;

public class Product {
	private int productId;
	private String productName;
	private String category;
	private double price;
	private String brand;
	private int stock;
	
	@Value("${pId}")
	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	@Value("${pName}")
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	@Value("${category}")
	public void setCategory(String category) {
		this.category = category;
	}
	
	@Value("${price}")
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Value("${brand}")
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	@Value("${stock}")
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", category=" + category
				+ ", price=" + price + ", brand=" + brand + ", stock=" + stock + "]";
	}
	
	
	
}
