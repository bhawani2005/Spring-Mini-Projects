package com.profile;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:com/profile/application-dev.properties")
@ComponentScan(basePackages = "com.profile")
@Profile("dev")
public class PaymentConfigurationDev {

}
