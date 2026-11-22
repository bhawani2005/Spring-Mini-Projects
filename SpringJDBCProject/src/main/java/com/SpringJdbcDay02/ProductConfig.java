package com.SpringJdbcDay02;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@PropertySource("classpath:com/SpringJdbcDay02/application.properties")
@ComponentScan(basePackages = "com.SpringJdbcDay02")
public class ProductConfig {
	
	@Autowired
	Environment environment;
	
	@Bean
	public DataSource source() {
		DriverManagerDataSource source = new DriverManagerDataSource();
		source.setDriverClassName(environment.getProperty("db.driverClassName"));
		source.setUrl(environment.getProperty("db.url"));
		source.setUsername(environment.getProperty("db.username"));
		source.setPassword(environment.getProperty("db.password"));
		
		return source;
	}
	
	@Bean
	public JdbcTemplate template() {
		JdbcTemplate template = new JdbcTemplate(source());
		
		return template;
	}
}
