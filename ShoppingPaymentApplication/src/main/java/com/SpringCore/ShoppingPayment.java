package com.SpringCore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ShoppingPayment {


	
	@Autowired
	@Qualifier("card")
	private IPayment payment;


	
	public void payment() {
		
		if(payment.paymentVarification()) {
			System.out.println("Payment will be done by "+getPaymentMode());
		}
		else {
			System.out.println("Payment Failed");
		}
	}
	
	public String getPaymentMode() {
		
		if (payment instanceof Paytem) {
			return "Payment";
		}
		
		if (payment instanceof PhonePay) {
			return "PhonePay";
		}
		
		if (payment instanceof GPay) {
			return "GooglePay";
		}
		
		if (payment instanceof Card) {
			return "Card";
		}
		else {
			return null;
		}
		
	}
}
