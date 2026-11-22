package com.aster;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.aster.Entity.Patient;


public class App 
{
    public static void main( String[] args )
    {
        Configuration cnf = new Configuration();
        cnf.configure("com/aster/hibernate-cnf.xml");
        
        SessionFactory factory = cnf.buildSessionFactory();
        
        Patient patient = new Patient();
        patient.setName("Rahul");
        patient.setEmail("rahul2004@gmail.com");
        patient.setAge(25);
        patient.setGender("M");
        patient.setPhoneNumber(9623587592l);
        patient.setAddress("Baharagora, Jamshadpur, Jharkhand, 832101");
        patient.setAdmissionDate(LocalDateTime.of(2026, 10, 2, 11, 35, 0));
        patient.setDischargeDate(LocalDateTime.of(2026, 10, 5, 9, 30, 0));
        patient.setMedicalHistory("Patient has a history of asthma and diabetes.\r\n"
        		+ "Previous surgery was performed in 2022.\r\n"
        		+ "Currently taking prescribed medication.");
        
        Path path = Paths.get("C:\\Users\\bhawa\\Documents\\demo\\Rahul_Report.pdf");
        byte []allByte = null;
        
        try {
			allByte = Files.readAllBytes(path);
		} catch (IOException e) {
			e.printStackTrace();
		}
        
        patient.setPatientDoc(allByte);
        
        
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        
        //session.persist(patient);
        
        transaction.commit();
        session.close();
        
        Session session2 = factory.openSession();
        
        Patient patient2 =  session2.get(Patient.class, 1);
        System.out.println(patient2);
        
        session2.close();
        
        
    }
}
