package com.component;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

@Component("services")
public class HospitalService {

	private List<Hospital> hospitals;

	public HospitalService() {
		hospitals = new ArrayList<Hospital>();
	}

	public int addHospital(String hospitalName, List<String> listOfTreatments, String contactPerson,
			String contactNumber, String location) {
		Hospital h = new Hospital(hospitalName, listOfTreatments, contactPerson, contactNumber, location);

		hospitals.add(h);

		return h.getHospitalCode();
	}

	public Map getHospital(int id) {

		Map<Integer, String> data = new LinkedHashMap<>();

		data = hospitals.stream().filter(hos -> (hos.getHospitalCode() == id))
				.collect(Collectors.toMap(hos -> (hos.getHospitalCode()), hos -> (hos.getHospitalName())));

		return data;
	}

}
