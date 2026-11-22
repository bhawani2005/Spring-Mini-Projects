package com.SpringJdbcDay01;

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
@PropertySource("classpath:com/SpringJdbcDay01/application.properties")
@ComponentScan(basePackages = "com.SpringJdbcDay01")
public class ProductConfig {

	@Autowired
	Environment environment;

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(environment.getProperty("db.driverClassName"));
		dataSource.setUrl(environment.getProperty("db.url"));
		dataSource.setUsername(environment.getProperty("db.username"));
		dataSource.setPassword(environment.getProperty("db.password"));

		return dataSource;
	}

	@Bean
	public JdbcTemplate template() {
		return new JdbcTemplate(dataSource());
	}
}
