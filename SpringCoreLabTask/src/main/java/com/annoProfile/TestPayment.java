package com.annoProfile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("test")
public class TestPayment implements IPayment {

	@Override
	public void pay() {
		System.out.println("Payment is running in TEST environment");

	}

}
