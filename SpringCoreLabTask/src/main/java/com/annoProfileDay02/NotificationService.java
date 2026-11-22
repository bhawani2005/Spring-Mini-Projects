package com.annoProfileDay02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NotificationService {
	//@Autowired
	private INotification iNotification;

	public NotificationService() {
		super();
	}

	public INotification getiNotification() {
		return iNotification;
	}

	public void setiNotification(INotification iNotification) {
		this.iNotification = iNotification;
	}
	
	public void set() {
		iNotification.active();
	}
}
