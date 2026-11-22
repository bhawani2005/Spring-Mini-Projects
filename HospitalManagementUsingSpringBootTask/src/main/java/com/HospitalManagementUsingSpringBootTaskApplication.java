package com;

import java.awt.List;
import java.util.Collections;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.bind.Bindable;
import org.springframework.boot.context.properties.bind.Binder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

import com.component.Hospital;
import com.component.HospitalService;

@SpringBootApplication
public class HospitalManagementUsingSpringBootTaskApplication {

	@Autowired
	Environment environment;

	@Bean
	public Hospital hospital() {
		Hospital h = new Hospital();
		h.setHospitalName(environment.getProperty("hospital.hospitalName"));
		h.setListOfTreatments(
				Binder.get(environment)
				.bind("hospital.listoftreatement", Bindable.listOf(String.class))
				.orElse(Collections.emptyList())
				);

		h.setContactPerson(environment.getProperty("hospital.contactPerson"));
		h.setContactNumber(environment.getProperty("hospital.contactNumber"));
		h.setLocation(environment.getProperty("hospital.location"));

		return h;
	} 

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(
				HospitalManagementUsingSpringBootTaskApplication.class,args);
		
		Hospital bean = context.getBean("hospital",Hospital.class);
        System.out.println(bean);
        
        HospitalService bean2 = context.getBean("services",HospitalService.class);
        int code = bean2.addHospital(bean.getHospitalName(),
        		           bean.getListOfTreatments(),
        		           bean.getContactPerson(),
        		           bean.getContactNumber(),
        		           bean.getLocation());
        System.out.println(code);
        
         Map<Integer, String> hospital = bean2.getHospital(code);
         System.out.println(hospital);
	}

}
