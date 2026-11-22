package com.componant;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("test")
public class TestPaymentService implements PaymentService {

	@Override
	public void processPayment() {
		System.out.println("Test Payment Mode Active");
		System.out.println("Payment processed using dummy payment");
	}

}
