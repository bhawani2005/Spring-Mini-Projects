package com.annotationPropertySourceAndValue;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("mobilePhone")
@Scope("prototype")
@PropertySource("classpath:com/annotationPropertySourceAndValue")
public class MobilePhone {
	
	private String brand;
	private String model;
	private double price;
	private String operatingSystem;
	private String storage;
	
	
	@Value("${brand}")
	public void setBrand(String brand) {
		this.brand = brand;
	}


	@Value("${model}")
	public void setModel(String model) {
		this.model = model;
	}


	@Value("${price}")
	public void setPrice(double price) {
		this.price = price;
	}


	@Value("${operatingSystem}")
	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}


	@Value("${storage}")
	public void setStorage(String storage) {
		this.storage = storage;
	}



	@Override
	public String toString() {
		return "MobilePhone [brand=" + brand + ", model=" + model + ", price=" + price + ", operatingSystem="
				+ operatingSystem + ", storage=" + storage + "]";
	}
	
	
}
