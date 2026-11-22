package com.SpringCoreExam3;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:com/SpringCoreExam3/application.properties")
public class ShoppingOrder {
	@Value("${applicationName}")
	private String applicationName;
	
	@Value("${companyName}")
	private String companyName;
	
	@Value("${coustomerName}")
	private String coustomerName;
	
	@Value("${orderId}")
	private String orderId;
	
	@Value("${productName}")
	private String productName;
	
	@Value("${productPrice}")
	private double productPrice;
	
	@Value("${deliveryCharge}")
	private double deliveryCharge;
	
	@Value("${taxPercentage}")
	private double taxPercentage;
	
	@Autowired
	@Qualifier("expressDeliveryService")
	private DeliveryService deliveryService;
	
	public ShoppingOrder() {
		super();
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public void setCoustomerName(String coustomerName) {
		this.coustomerName = coustomerName;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public void setTaxPercentage(double taxPercentage) {
		this.taxPercentage = taxPercentage;
	}

	public void setDeliveryCharge(double deliveryCharge) {
		this.deliveryCharge = deliveryCharge;
	}

	public DeliveryService getDeliveryService() {
		return deliveryService;
	}

	public void setDeliveryService(DeliveryService deliveryService) {
		this.deliveryService = deliveryService;
	}
	
	
	

	@Override
	public String toString() {
		return "ShoppingOrder [applicationName=" + applicationName + ", companyName=" + companyName + ", coustomerName="
				+ coustomerName + ", orderId=" + orderId + ", productName=" + productName + ", productPrice="
				+ productPrice + ", deliveryCharge=" + deliveryCharge + ", taxPercentage=" + taxPercentage
				+ ", deliveryService=" + deliveryService + "]";
	}

	public void deliver() {
		System.out.println(this.toString());
		System.out.println("Total Ammount : "+(productPrice+(productPrice*taxPercentage)+deliveryCharge));
		deliveryService.deliver();
	}
	
	
}
