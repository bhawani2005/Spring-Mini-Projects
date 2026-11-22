package com.primaryAndQualifierUse;

import org.springframework.beans.factory.annotation.Autowired;

public class RoomAllocationService {
	
	private HospitalRoom hr;

	public RoomAllocationService() {
		super();
	}

	@Autowired
	public void setHr(HospitalRoom hr) {
		this.hr = hr;
	}

	public void display() {
		hr.AllocateRoom();
	}
}
