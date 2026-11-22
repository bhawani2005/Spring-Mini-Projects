package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Employee;

public class App 
{
	public static void main( String[] args )
    {
        System.out.println( "welcome to Hibernate." );
        
        Configuration cnf = new Configuration();
        cnf.configure("com/hibernate/hibernate-cnf.xml");
        
        SessionFactory factory = cnf.buildSessionFactory();
        System.out.println(factory);
        
        Session session = factory.openSession();
        
        Transaction transaction = session.beginTransaction();
        
//        Employee emp = new Employee();
//        emp.setId(102);
//        emp.setName("rahul");
//        emp.setAddress("bbsr");
//        emp.setSalary(22000);
//        
//        session.persist(emp);
//        
        transaction.commit();
        session.close();
        
        Session session2 = factory.openSession();
        Employee emp1 = session2.get(Employee.class, 101);
        System.out.println(emp1);
        session2.close();
    }
}
