package com.annoProfile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class ProductionPayment implements IPayment {

	@Override
	public void pay() {
		System.out.println("Payment is running in PRODUCTION environment");

	}

}
