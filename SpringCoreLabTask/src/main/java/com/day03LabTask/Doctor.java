package com.day03LabTask;

public class Doctor {
	private int doctorId;
	private String doctorName;
	private String Specialization;
	private String hospitalName;
	
	public Doctor(int doctorId, String doctorName) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
	}

	public String getSpecialization() {
		return Specialization;
	}

	public void setSpecialization(String specialization) {
		Specialization = specialization;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	@Override
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", doctorName=" + doctorName + ", Specialization=" + Specialization
				+ ", hospitalName=" + hospitalName + "]";
	}
	
	
	
}
