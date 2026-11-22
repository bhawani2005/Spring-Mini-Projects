package com.notificationServiceFeatures;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class NotificationService {
	private List<String> notificationTypeService;
	private Set<String> serviceRegions;
	private Map<String, String> notificationProvider;
	private Properties basicConfigProperties;
	
	public NotificationService() {
		super();
	}
	
	public List<String> getNotificationTypeService() {
		return notificationTypeService;
	}
	public void setNotificationTypeService(List<String> notificationTypeService) {
		this.notificationTypeService = notificationTypeService;
	}
	
	public Set<String> getServiceRegions() {
		return serviceRegions;
	}
	public void setServiceRegions(Set<String> serviceRegions) {
		this.serviceRegions = serviceRegions;
	}
	
	public Map<String, String> getNotificationProvider() {
		return notificationProvider;
	}
	public void setNotificationProvider(Map<String, String> notificationProvider) {
		this.notificationProvider = notificationProvider;
	}
	
	public Properties getBasicConfigProperties() {
		return basicConfigProperties;
	}
	public void setBasicConfigProperties(Properties basicConfigProperties) {
		this.basicConfigProperties = basicConfigProperties;
	}
	
	@Override
	public String toString() {
		return "NotificationService [notificationTypeService=" + notificationTypeService + ", serviceRegions="
				+ serviceRegions + ", notificationProvider=" + notificationProvider + ", basicConfigProperties="
				+ basicConfigProperties + "]";
	}
	
	
}
