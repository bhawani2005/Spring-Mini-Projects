package com.SpringCoreExam3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:com/SpringCoreExam3/application.properties")
public class BookService {
	
	@Value("${passengerName}")
	private String passengerName;
	
	@Value("${source}")
	private String source;
	
	@Value("${destination}")
	private String destination;
	
	@Value("${numberOfPassengers}")
	private int numberOfPassengers;
	
	@Value("${BaseFare}")
	private double BaseFare;
	
	@Value("${TaxPercentage}")
	private double TaxPercentage;
	
	@Value("${BookingCharge}")
	private double BookingCharge;
	
	@Autowired
	@Qualifier("busFareService")
	private FareService fareService;

	@Override
	public String toString() {
		return "BookService [passengerName=" + passengerName + ", source=" + source + ", destination=" + destination
				+ ", numberOfPassengers=" + numberOfPassengers + ", BaseFare=" + BaseFare + ", TaxPercentage="
				+ TaxPercentage + ", BookingCharge=" + BookingCharge + ", fareService=" + fareService + "]";
	}
	
	public void bookDetails() {
		System.out.println(this.toString());
		
		System.out.println("Base fare: "+(BaseFare*numberOfPassengers));
		System.out.println("Total fare: "+((BaseFare*numberOfPassengers)+((BaseFare*numberOfPassengers)*TaxPercentage)+BookingCharge));
		
		fareService.book();
	}
}
