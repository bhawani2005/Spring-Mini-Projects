package com.annoProfileDay02;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("sms")
public class SmsNotification implements INotification {

	@Override
	public void active() {
		System.out.println("SMS Notification service Active.");

	}

}
