package designPattern;

public class TravelBooking {

	private String source;
	private String destination;
	private int passengers;
	private String travelClass;

	public TravelBooking() {

	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getPassengers() {
		return passengers;
	}

	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}

	public String getTravelClass() {
		return travelClass;
	}

	public void setTravelClass(String travelClass) {
		this.travelClass = travelClass;
	}

	@Override
	public String toString() {
		return "TravelBooking [source=" + source + ", destination=" + destination + ", passengers=" + passengers
				+ ", travelClass=" + travelClass + "]";
	}

}
