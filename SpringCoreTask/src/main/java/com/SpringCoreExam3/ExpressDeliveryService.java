package com.SpringCoreExam3;

import org.springframework.stereotype.Component;

@Component
public class ExpressDeliveryService implements DeliveryService {

	
	
	@Override
	public void deliver() {
		System.out.println("Delivery done through Express Delivery");

	}

}
