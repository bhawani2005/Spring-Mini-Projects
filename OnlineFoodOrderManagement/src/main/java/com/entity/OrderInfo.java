package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "order_info")
@Data
public class OrderInfo {

	@Id
	private int orderId;
	private String customerName;
	private long customerNumber;
	private String foodName;
	private int foodQuantity;
	private double foodPrice;
	private String restaurantName;
	private String paymentOption;
	private String deliveryAddress;
	private String status;
	private double totalAmount;
	
	
}
