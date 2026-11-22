package com.nit;

import java.util.Arrays;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.connection.ConnectionProvider;
import com.entity.Department;
import com.entity.Doctor;

public class App 
{
    public static void main( String[] args )
    {
        SessionFactory factory = ConnectionProvider.getFactory();
        
        Department dept1 = new Department();
        dept1.setDeptName("ENT");
        dept1.setLocation("Pune");
        dept1.setEstablishedYear(2010);
        
        
        Doctor d1 = new Doctor();
        d1.setDoctorName("Aasutosh");
        d1.setSalary(90000);
        d1.setSpecialization("Rhinology");
        d1.setDepartment(dept1);
        
        Doctor d2 = new Doctor();
        d2.setDoctorName("Jack");
        d2.setSalary(60000);
        d2.setSpecialization("Laryngology");
        d2.setDepartment(dept1);
        
        Doctor d3 = new Doctor();
        d3.setDoctorName("Sieen");
        d3.setSalary(145000);
        d3.setSpecialization("Otology and Neurotology");
        d3.setDepartment(dept1);
        
        dept1.setDoctors(Arrays.asList(d1, d2, d3));
        
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        
        session.persist(dept1);
        session.persist(d1);
        session.persist(d2);
        session.persist(d3);
        
        transaction.commit();
        session.close();
    }
}
