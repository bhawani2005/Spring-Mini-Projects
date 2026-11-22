package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;

import com.componant.HospitalConfig;

@SpringBootApplication
@EnableConfigurationProperties(HospitalConfig.class)
public class SpringBootUsingYamlApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootUsingYamlApplication.class, args);
		
		HospitalConfig bean = context.getBean(HospitalConfig.class);
		System.out.println(bean);
	}

}
