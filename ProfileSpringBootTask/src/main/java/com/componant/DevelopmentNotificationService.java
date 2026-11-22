package com.componant;

import lombok.Data;

@Data
public class DevelopmentNotificationService implements NotificationService {

	private String msg;
	
	@Override
	public void sendNotification() {
		System.out.println(msg);

	}

}
