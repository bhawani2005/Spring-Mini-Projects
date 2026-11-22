package com.annoQualifierAndAutowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class OrderService {
	@Autowired
	@Qualifier("creditCard")
	private PaymentService paymentService;

	public OrderService() {
		super();
	}

	public void setPaymentService(PaymentService paymentService) {
		this.paymentService = paymentService;
	}

	public PaymentService getPaymentService() {
		return paymentService;
	}
	
	
}
