package com.annoProfileDay02;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("email")
public class EmailNotification implements INotification {

	@Override
	public void active() {
		System.out.println("Email Notification service Active.");

	}

}
