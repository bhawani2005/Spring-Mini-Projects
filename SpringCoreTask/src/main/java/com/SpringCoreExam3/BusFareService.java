package com.SpringCoreExam3;

import org.springframework.stereotype.Component;

@Component
public class BusFareService implements FareService{

	@Override
	public void book() {
		System.out.println("Booking done for Bus.");
		
	}

}
