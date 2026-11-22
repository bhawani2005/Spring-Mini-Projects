package com.annoProfile;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ComponentScan(basePackages = "com.annoProfile")
@Profile("test")
public class PaymentConfigTest {

}
