package com.xmlAnnoQualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FoodOrder {
	
	@Autowired
	@Qualifier("upiPaymentService")
	private PaymentService paymentService;

	public FoodOrder() {

	}

	public PaymentService getPaymentService() {
		return paymentService;
	}

	public void setPaymentService(PaymentService paymentService) {
		this.paymentService = paymentService;
	}
	
	public void pay() {
		paymentService.makePayment();
		System.out.println("Food Order Successfully.");
	}
}
