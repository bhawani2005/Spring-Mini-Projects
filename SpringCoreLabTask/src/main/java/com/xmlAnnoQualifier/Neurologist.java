package com.xmlAnnoQualifier;

import org.springframework.stereotype.Component;

@Component
public class Neurologist implements Doctor {

	@Override
	public void check() {
		System.out.println("Neuro checkUp Complete.");
		
	}

}
