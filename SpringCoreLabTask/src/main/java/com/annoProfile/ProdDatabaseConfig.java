package com.annoProfile;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("prod")
@ComponentScan(basePackages = "com.annoProfile")
public class ProdDatabaseConfig {

}
