package com.annoProfileDay02;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("card")
public class CardPayment implements IPayment {

	@Override
	public void pay() {
		System.out.println("Payment done through Card.");

	}

}
