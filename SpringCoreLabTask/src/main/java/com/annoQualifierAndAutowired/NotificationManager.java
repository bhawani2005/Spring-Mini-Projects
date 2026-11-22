package com.annoQualifierAndAutowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class NotificationManager {
	@Autowired
	@Qualifier("emailNotification")
	NotificationService notificationService;

	public NotificationManager() {
		super();
	}

	public NotificationService getNotificationService() {
		return notificationService;
	}

	public void setNotificationService(NotificationService notificationService) {
		this.notificationService = notificationService;
	}
	
	
}
