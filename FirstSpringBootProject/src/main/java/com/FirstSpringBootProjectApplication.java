package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

import com.Component.Chip;
import com.Component.Robot;

@SpringBootApplication
public class FirstSpringBootProjectApplication {

	@Autowired
	Environment environment;

    @Bean
    public Chip chip() {
		Chip chip = new Chip();
		
		chip.setChipCompanyName(environment.getProperty("chipCompanyName"));
		chip.setChipType(environment.getProperty("chipType"));
		
		return chip;
	}
	
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(FirstSpringBootProjectApplication.class, args);
		
		Robot bean = context.getBean("robot", Robot.class);
		
		bean.onRobo();
	}

}
