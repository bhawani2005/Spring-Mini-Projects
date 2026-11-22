package com.annoQualifierAndAutowired;

public class PushNotification implements NotificationService{

	@Override
	public void sendNotification() {
		System.out.println("Notification send using Push...");
		
	}

}
