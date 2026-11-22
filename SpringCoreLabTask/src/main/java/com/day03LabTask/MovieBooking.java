package com.day03LabTask;

public class MovieBooking {
	private int bookingId;
	private String movieName;
	private String theaterName;
	private int seatNumber;
	private int showTime;
	
	public MovieBooking(int bookingId, String movieName) {
		super();
		this.bookingId = bookingId;
		this.movieName = movieName;
	}

	public String getTheaterName() {
		return theaterName;
	}

	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}

	public int getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}

	public int getShowTime() {
		return showTime;
	}

	public void setShowTime(int showTime) {
		this.showTime = showTime;
	}

	@Override
	public String toString() {
		return "MovieBooking [bookingId=" + bookingId + ", movieName=" + movieName + ", theaterName=" + theaterName
				+ ", seatNumber=" + seatNumber + ", showTime=" + showTime + "]";
	}
	
	
}
