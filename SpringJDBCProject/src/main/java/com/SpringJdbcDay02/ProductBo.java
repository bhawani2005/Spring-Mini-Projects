package com.SpringJdbcDay02;

public class ProductBo {
	private int productId;
	private String productName;
	private double price;
	private int quantity;
	
	public ProductBo() {
		super();
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "ProductBo [productId=" + productId + ", productName=" + productName + ", price=" + price + ", quantity="
				+ quantity + "]";
	}
	
	
}
