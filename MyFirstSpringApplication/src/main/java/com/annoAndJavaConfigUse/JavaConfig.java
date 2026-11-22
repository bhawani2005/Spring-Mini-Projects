package com.annoAndJavaConfigUse;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.annoAndJavaConfigUse")
public class JavaConfig {
	
	@Bean
	public Launcher launcher1() {
		return new Launcher();
	}
	
	@Bean
	public Launcher launcher2() {
		return new Launcher();
	}
}
