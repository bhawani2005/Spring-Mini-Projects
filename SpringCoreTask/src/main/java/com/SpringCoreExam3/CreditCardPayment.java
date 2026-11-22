package com.SpringCoreExam3;

import org.springframework.stereotype.Component;

@Component
public class CreditCardPayment implements PaymentService {

	@Override
	public void pay() {
		System.out.println("Payment done through Credit card.");

	}

}
