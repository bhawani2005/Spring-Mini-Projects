package com.profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PaymentService {
	
	@Value("${gateway.name}")
	private String gatewayName;
	@Value("${curency}")
	private String curency;
	
	@Autowired
	private IPaymentVerification iPaymentVerification;

	public PaymentService() {
		super();
	}

	

	public void setGatewayName(String gatewayName) {
		this.gatewayName = gatewayName;
	}



	public void setCurency(String curency) {
		this.curency = curency;
	}

	public void setiPaymentVerification(IPaymentVerification iPaymentVerification) {
		this.iPaymentVerification = iPaymentVerification;
	}

	
	
	@Override
	public String toString() {
		return "PaymentService [gatewayName=" + gatewayName + ", curency=" + curency + ", iPaymentVerification="
				+ iPaymentVerification + "]";
	}



	public void payment(double amount) {
		iPaymentVerification.pay(amount);
		System.out.println("Payment done Successfully.");
	}
}
