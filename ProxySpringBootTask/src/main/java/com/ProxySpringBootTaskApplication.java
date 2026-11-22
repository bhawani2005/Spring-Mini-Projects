package com;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;

import com.Component.BankServiceImp;
import com.Component.BankServiceProxy;

@SpringBootApplication
@EnableConfigurationProperties(BankServiceImp.class)
public class ProxySpringBootTaskApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(ProxySpringBootTaskApplication.class, args);
		
		BankServiceProxy bean = applicationContext.getBean(BankServiceProxy.class);
		System.out.println(bean.checkBalance());
		bean.deposit(500);
		System.out.println(bean.checkBalance());
		bean.withdraw(300);
		System.out.println(bean.checkBalance());
		

		
	}

}
