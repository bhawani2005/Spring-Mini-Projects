package com.task02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.task02")
@PropertySource("classpath:com/task02/application.properties")
public class PaymentConfig {

	@Bean
	public PaymentService paymentService() {
		return new PaymentService();
	}
}
