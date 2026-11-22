package com.JavaConfigValueInject;

public class Player {
	private String Name;
	private int JerseyNumber ;
	private int highestRun;
	private int totalRun;
	private String country;
	
	public Player() {
		super();
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public void setJerseyNumber(int jerseyNumber) {
		JerseyNumber = jerseyNumber;
	}

	public void setHighestRun(int highestRun) {
		this.highestRun = highestRun;
	}

	public void setTotalRun(int totalRun) {
		this.totalRun = totalRun;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getJerseyNumber() {
		return JerseyNumber;
	}

	public int getHighestRun() {
		return highestRun;
	}

	public int getTotalRun() {
		return totalRun;
	}

	public String getCountry() {
		return country;
	}

	@Override
	public String toString() {
		return "Player [Name=" + Name + ", JerseyNumber=" + JerseyNumber + ", highestRun=" + highestRun + ", totalRun="
				+ totalRun + ", country=" + country + "]";
	}
	
}
