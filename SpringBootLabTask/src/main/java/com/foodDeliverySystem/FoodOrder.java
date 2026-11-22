package com.foodDeliverySystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class FoodOrder {

	@Autowired
	private Restaurant restaurant;
	@Autowired
	private Menu menu;
	@Autowired
	private DeliveryPartner partner;
	
	public void placedOrder() {
		System.out.println("Welcome to Online Food Delivery System");
		restaurant.displayRestaurant();
		menu.displayMenu();
		partner.displayDeliveryPartner();
		System.out.println("Your food order is successfully placed!");
	}
}
