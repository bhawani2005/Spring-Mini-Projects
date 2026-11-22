package com.componant;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("live")
public class LivePaymentService implements PaymentService {

	@Override
	public void processPayment() {
		System.out.println("Live Payment Mode Active");
		System.out.println("Payment processed successfully");
	}

}
