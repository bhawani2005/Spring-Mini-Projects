package com.annoQualifierAndAutowired;

public class EmailNotification implements NotificationService{

	@Override
	public void sendNotification() {
		System.out.println("Notification send using Email...");
		
	}

}
