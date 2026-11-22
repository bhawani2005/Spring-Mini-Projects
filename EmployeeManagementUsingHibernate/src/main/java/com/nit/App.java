package com.nit;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.nit.entity.Employee;

public class App 
{
    public static void main( String[] args )
    {
        Configuration cnf = new Configuration();
        cnf.configure("com/nit/hibernate-cnf.xml");
        
        SessionFactory factory = cnf.buildSessionFactory();
        
        Employee e = new Employee();
        e.setName("Peter paker");
        e.setAddress("Newyork");
        e.setCompanyName("Marvel");
        e.setContactNumber(6215348945l);
        e.setDate(LocalDate.of(2009, 10, 15));
        e.setAssignTime(LocalTime.of(9, 0, 0));
        e.setSubmisionDate(LocalDateTime.of(2024, 1, 2, 9, 0, 0));
        
        Path path = Paths.get("C:\\Users\\bhawa\\Pictures\\spiderMan.jpg");
        byte[] allBytes = null;
        try {
        	allBytes = Files.readAllBytes(path);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
        
        e.setImage(allBytes);
        
        Session session1 = factory.openSession();
        Transaction transaction = session1.beginTransaction();
        
        //session1.persist(e);
        
        transaction.commit();
        session1.close();
        
        Session session2 = factory.openSession();
        Employee emp = session2.get(Employee.class, 52);
        Path path1 = Paths.get("C:\\Users\\bhawa\\Pictures\\retriveImage.jpg");
        try {
			Files.write(path1, emp.getImage());
		} catch (IOException e1) {
			e1.printStackTrace();
		}
        System.out.println(emp);
        session2.close();
        
        
    }
}
