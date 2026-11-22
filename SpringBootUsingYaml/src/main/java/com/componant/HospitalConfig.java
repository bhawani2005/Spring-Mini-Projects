package com.componant;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

@Data
@ConfigurationProperties(prefix = "hospital")
public class HospitalConfig {

	private String hospitalName;
	private int totalBeds;
	private double consultationFee;
	private boolean emergencyAvailable;
	private char hospitalCode;
	private List<String> doctorNames;
	private Map<String, String> departmentHeads;
	private Set<String> availableFacilities;
	private HospitalAddress hospitalAddress;
	private String []branchLocations;
}
