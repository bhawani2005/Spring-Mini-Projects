package com.annoQualifierAndAutowired;

public class CreditCardPayment implements PaymentService{

	@Override
	public void makePayment() {
		System.out.println("Payment Done using Credit Card...");
		
	}

}
