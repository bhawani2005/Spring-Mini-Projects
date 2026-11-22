package com.task01;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.task01")
@PropertySource("classpath:com/task01/application.properties")

public class CompanyConfig {

}
