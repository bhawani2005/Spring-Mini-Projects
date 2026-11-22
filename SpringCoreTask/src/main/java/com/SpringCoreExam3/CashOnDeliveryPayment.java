package com.SpringCoreExam3;

import org.springframework.stereotype.Component;

@Component
public class CashOnDeliveryPayment implements PaymentService {

	@Override
	public void pay() {
		System.out.println("Payment will done through cash on delivery.");
	}

}
