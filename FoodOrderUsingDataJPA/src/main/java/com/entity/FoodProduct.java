package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "food_order")
@Data
public class FoodProduct {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	private String orderName;
	private String customerName;
	private float price;
	private String aboutOrder;
	private String status;
}
