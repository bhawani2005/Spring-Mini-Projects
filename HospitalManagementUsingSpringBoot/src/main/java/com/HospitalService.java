package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class HospitalService {

	@Autowired
	Doctor doctor;
	
	public void displayDoctorDetails() {
		System.out.println("========== HOSPITAL DETAILS ==========");
		System.out.println();
		System.out.println("Doctor ID          :"+doctor.getId());
		System.out.println("Doctor Name        :"+doctor.getName());
		System.out.println("Specialization     :"+doctor.getSpecialization());
		System.out.println("Hospital Name      :"+doctor.getHospitalName());
		System.out.println("Consultation Fee   :"+doctor.getConsultationFee());
		System.out.println();
		System.out.println("======================================");
	}
}
