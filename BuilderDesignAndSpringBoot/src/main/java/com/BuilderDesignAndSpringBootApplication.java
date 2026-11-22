package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.component.EmployeeService;

@SpringBootApplication
public class BuilderDesignAndSpringBootApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BuilderDesignAndSpringBootApplication.class, args);
		
		EmployeeService bean = context.getBean("employeeService", EmployeeService.class);
		bean.printEmployeeDetails();
	}

}
