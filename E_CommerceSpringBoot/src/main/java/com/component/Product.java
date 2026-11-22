package com.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Product {

	@Value("${id}")
	private int id;
	
	@Value("${name}")
	private String name;
	
	@Value("${category}")
	private String category;
	
	@Value("${brand}")
	private String brand;
	
	@Value("${price}")
	private double price;
	
	@Value("${availability}")
	private String availability;
}
