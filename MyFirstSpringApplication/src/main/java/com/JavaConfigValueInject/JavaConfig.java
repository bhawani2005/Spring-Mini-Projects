package com.JavaConfigValueInject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;

@Configuration
@PropertySources({@PropertySource("classpath:com/JavaConfigValueInject/application.properties"),
	@PropertySource("classpath:com/JavaConfigValueInject/application1.properties")})
public class JavaConfig {
	
	@Autowired
	Environment enviroment;
	
	@Bean
	public Player player1() {
		Player player = new Player();
		player.setName(enviroment.getProperty("name1"));
		player.setJerseyNumber(Integer.parseInt(enviroment.getProperty("jerseyNumber1")));
		player.setHighestRun(Integer.parseInt(enviroment.getProperty("highestRun1")));
		player.setTotalRun(Integer.parseInt(enviroment.getProperty("totalRun1")));
		player.setCountry(enviroment.getProperty("country1"));
		return player;
	}
	
	@Bean
	public Player player2() {
		Player player = new Player();
		player.setName(enviroment.getProperty("name2"));
		player.setJerseyNumber(Integer.parseInt(enviroment.getProperty("jerseyNumber2")));
		player.setHighestRun(Integer.parseInt(enviroment.getProperty("highestRun2")));
		player.setTotalRun(Integer.parseInt(enviroment.getProperty("totalRun2")));
		player.setCountry(enviroment.getProperty("country2"));
		return player;
	}

	
}
