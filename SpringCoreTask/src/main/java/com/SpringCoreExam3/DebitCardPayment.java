package com.SpringCoreExam3;

import org.springframework.stereotype.Component;

@Component
public class DebitCardPayment implements PaymentService{

	@Override
	public void pay() {
		System.out.println("Payment done through Debit card.");
		
	}

}
