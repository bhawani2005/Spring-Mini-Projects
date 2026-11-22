package com.xmlAnnoQualifier;

import org.springframework.stereotype.Component;

@Component
public class UpiPaymentService implements PaymentService{

	@Override
	public void makePayment() {
		System.out.println("Payment done using upi");
	}
	
}
