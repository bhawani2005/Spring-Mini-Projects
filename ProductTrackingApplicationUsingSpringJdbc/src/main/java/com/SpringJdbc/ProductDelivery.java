package com.SpringJdbc;

import lombok.Data;

@Data
public class ProductDelivery {
	
	
	private String productName;
	private String productShippingAddress;
	private double productPrice;
	private int productQuantity;
	private String productPlaceDate;
	@Override
	public String toString() {
		return "productName=" + productName + ", productShippingAddress=" + productShippingAddress
				+ ", productPrice=" + productPrice + ", productQuantity=" + productQuantity + ", productPlaceDate="
				+ productPlaceDate;
	}
	
	
	
	
	
}
