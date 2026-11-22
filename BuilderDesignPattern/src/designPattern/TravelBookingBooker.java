package designPattern;

public class TravelBookingBooker {

	private String source;
	private String destination;
	private int passengers;
	private String travelClass;

	public TravelBookingBooker() {

	}

	public String getSource() {
		return source;
	}

	public TravelBookingBooker setSource(String source) {
		this.source = source;
		return this;
	}

	public String getDestination() {
		return destination;
	}

	public TravelBookingBooker setDestination(String destination) {
		this.destination = destination;
		return this;
	}

	public int getPassengers() {
		return passengers;
	}

	public TravelBookingBooker setPassengers(int passengers) {
		this.passengers = passengers;
		return this;
	}

	public String getTravelClass() {
		return travelClass;
	}

	public TravelBookingBooker setTravelClass(String travelClass) {
		this.travelClass = travelClass;
		return this;
	}
	
	public TravelBooking book() {
		TravelBooking tb = new TravelBooking();
		
		tb.setSource(this.source);
		tb.setDestination(this.destination);
		tb.setPassengers(this.passengers);
		tb.setTravelClass(this.travelClass);
		
		return tb;
	}
}
