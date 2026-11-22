package com.profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class PaymentVerificationDev implements IPaymentVerification {

	@Override
	public void pay(double amount) {
		System.out.println("Amount : "+amount+" varification successfully.");

	}

}
