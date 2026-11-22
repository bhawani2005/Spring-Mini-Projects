package com.annoQualifierAndAutowired;

public class SmsNotification implements NotificationService{

	@Override
	public void sendNotification() {
		System.out.println("Notification send using SMS...");
		
	}

}
