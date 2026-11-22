package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.foodDeliverySystem.FoodOrder;

@SpringBootApplication
public class SpringBootLabTaskApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootLabTaskApplication.class, args);
		
		FoodOrder bean = context.getBean("foodOrder", FoodOrder.class);
		bean.placedOrder();
	}

}
