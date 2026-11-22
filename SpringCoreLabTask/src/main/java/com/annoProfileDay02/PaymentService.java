package com.annoProfileDay02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("payment")
public class PaymentService {
	//@Autowired
	private IPayment iPayment;

	public PaymentService() {
		super();
	}

	public IPayment getiPayment() {
		return iPayment;
	}

	public void setiPayment(IPayment iPayment) {
		this.iPayment = iPayment;
	}
	
	public void pay() {
		iPayment.pay();
	}
}
