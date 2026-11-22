package com.xmlAnnoQualifier;

import org.springframework.stereotype.Component;

@Component
public class JavaMentor implements Mentor {

	@Override
	public void guide() {
		System.out.println("We want to get engineers to think about something else");

	}

}
