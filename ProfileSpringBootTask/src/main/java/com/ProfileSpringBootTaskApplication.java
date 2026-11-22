package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;

import com.componant.DevelopmentNotificationService;
import com.componant.NotificationService;
import com.componant.PaymentService;
import com.componant.ProductionNotificationService;

@SpringBootApplication
public class ProfileSpringBootTaskApplication {
	
	@Autowired
	Environment environment;

	@Bean
	@Profile("dev")
	public ProductionNotificationService notificationService1() {
		ProductionNotificationService notificationService = new ProductionNotificationService();
		notificationService.setMsg(environment.getProperty("notification.msg"));
		
		return notificationService;
	}
	
	@Bean
	@Profile("Prod")
	public DevelopmentNotificationService notificationService2() {
		DevelopmentNotificationService notificationService = new DevelopmentNotificationService();
		notificationService.setMsg(environment.getProperty("notification.msg"));
		
		return notificationService;
	}

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ProfileSpringBootTaskApplication.class, args);
		
		NotificationService bean = context.getBean(NotificationService.class);
		bean.sendNotification();
		
	
		
	}

}
