package com.annoProfile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class ProductionDatabase implements IDatabase {

	@Override
	public void connection() {
		System.out.println("Connected to Production Database");

	}

}
