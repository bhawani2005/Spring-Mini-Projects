package com.SpringCoreExam3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Order {
	
	@Value("5000.00")
	private double amount;
	
	@Autowired
	@Qualifier("cashOnDeliveryPayment")
	private PaymentService paymentService;

	public Order() {
		super();
	}

	public PaymentService getPaymentService() {
		return paymentService;
	}

	public void setPaymentService(PaymentService paymentService) {
		this.paymentService = paymentService;
	}
	
	
	
	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public void pay() {
		System.out.println("Amount : "+amount);
		paymentService.pay();
	}
}
