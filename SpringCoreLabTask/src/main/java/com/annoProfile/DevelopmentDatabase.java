package com.annoProfile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class DevelopmentDatabase implements IDatabase {

	@Override
	public void connection() {
		System.out.println("Connected to Development Database");

	}

}
