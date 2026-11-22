package com.SpringCoreExam3;

import org.springframework.stereotype.Component;

@Component
public class FlightFareService implements FareService {

	@Override
	public void book() {
		System.out.println("Booking done for Flight");

	}

}
