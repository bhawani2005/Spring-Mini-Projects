package com.SpringCoreExam3;

import org.springframework.stereotype.Component;

@Component
public class StandardDeliveryService implements DeliveryService {

	
	
	@Override
	public void deliver() {
		System.out.println("Delivery done through Standard Delivery");

	}

}
