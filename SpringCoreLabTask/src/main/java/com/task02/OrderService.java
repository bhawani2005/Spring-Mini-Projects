package com.task02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class OrderService {

	@Value("${shop.name}")
	private String shopName;
	
	@Value("${payment.mode}")
	private String paymentMode;
	
	@Value("${payment.currency}")
	private String currency;
	
	@Autowired
	private Product product;
	@Autowired
	private PaymentService paymentService;
	
	@Override
	public String toString() {
		return "OrderService [shopName=" + shopName + ", paymentMode=" + paymentMode + ", currency=" + currency
				+ ", product=" + product + ", paymentService=" + paymentService + "]";
	}
	
	
}
