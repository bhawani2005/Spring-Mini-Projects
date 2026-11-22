package com.annoProfileDay02;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("oracle")
public class OracleDatabase implements IDatabase {

	@Override
	public void service() {
		System.out.println("Oracle database active.");

	}

}
