package com;

import java.sql.SQLException;
import java.time.LocalDateTime;

import org.h2.tools.Server;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	try {
			Server webServer = Server.createWebServer(
					"-web", "-webPort", "8084"
					).start();
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	
        Configuration cnf = new Configuration();
        cnf.configure("com/hibernate-cnf.xml");
       
        SessionFactory factory = cnf.buildSessionFactory();
        
        Address address = new Address();
        address.setStrret("Banjara Hills");
        address.setCity("Hyderabad");
        address.setPinCode("500012");
        
        Employee employee = new Employee();
        employee.setName("kunal kumar");
        employee.setCompanyName("EY");
        employee.setPhNo(9605566984l);
        employee.setEmail("kunalkumar@gmail.com");
        employee.setJoiningDate(LocalDateTime.of(2026, 10, 15, 9, 0, 0));
        employee.setAddress(address);
        
        
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        
        session.persist(employee);
        
        transaction.commit();
        session.close();
    }
}
