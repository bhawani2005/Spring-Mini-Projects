package com.SpringCore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;

@Configuration
@PropertySources({
	@PropertySource("classpath:com/SpringCore/OnlinePaymentApp.properties"),
	@PropertySource("classpath:com/SpringCore/ICICI.properties"),
	@PropertySource("classpath:com/SpringCore/SBI.properties")
})

@ComponentScan(basePackages = "com.SpringCore")
public class ShppingConfig {


	@Autowired
	Environment enviroment;

	
	@Bean
	public Paytem paytem() {
		Paytem paytem = new Paytem();
		paytem.setQrCode(enviroment.getProperty("paytemQRcode"));
		paytem.setName(enviroment.getProperty("name"));
		return paytem;
	}
	
	@Bean
	public PhonePay phonePay() {
		PhonePay phonePay = new PhonePay();
		phonePay.setQrCode(enviroment.getProperty("phonepayQRcode"));
		phonePay.setName(enviroment.getProperty("name"));
		return phonePay;
	}
	
	@Bean
	public GPay gPay() {
		GPay gPay = new GPay();
		gPay.setQrCode(enviroment.getProperty("gpayQRcode"));
		gPay.setName(enviroment.getProperty("name"));
		return gPay;
	}
	
	@Bean
	public Card card() {
		Card card = new Card();
		card.setCardName(enviroment.getProperty("cardName2"));
		card.setCardNumber(enviroment.getProperty("cardNumber2"));
		return card;
	}
}
