package com.xmlAnnoQualifier;

import org.springframework.stereotype.Component;

@Component
public class PythonMentor implements Mentor {

	@Override
	public void guide() {
		System.out.println("Programming isn't about what you know; it's about what you can figure out.");

	}

}
