package com.xmlAnnoQualifier;

import org.springframework.stereotype.Component;

@Component
public class Cardiologist implements Doctor {

	@Override
	public void check() {
		System.out.println("Cardio checkUp Complete.");
		
	}
	
}
