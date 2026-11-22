package com.annoProfileDay02;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("mysql")
public class MySQLDatabase implements IDatabase {

	@Override
	public void service() {
		System.out.println("MySQL Database active.");

	}

}
