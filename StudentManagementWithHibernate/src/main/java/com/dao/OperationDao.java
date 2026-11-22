package com.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.connection.BuildConnection;
import com.entity.Student;

public class OperationDao {

	public static String insertStudent(List<Student> data) {

		Session session = BuildConnection.getConnection().openSession();
		Transaction transaction = session.beginTransaction();

		for (Student value : data) {
			session.persist(value);
		}

		transaction.commit();
		session.close();

		return "Data inserted successfully";
	}

	@SuppressWarnings("removal")
	public static List<Student> getStudents(List<Student> data) {

		Session session = BuildConnection.getConnection().openSession();
		Transaction transaction = session.beginTransaction();

		List<Student> resultData = new ArrayList<Student>();

		for (Student value : data) {
			Student student = session.get(Student.class, value.getId());

			resultData.add(student);
		}

		transaction.commit();
		session.close();

		return resultData;
	}
	
	@SuppressWarnings("removal")
	public static Student updateData(int id, String fieldName, Object value) {
		Session session = BuildConnection.getConnection().openSession();
		Transaction transaction = session.beginTransaction();
		
		Student student = session.getReference(Student.class, id);
		
		if(fieldName.equalsIgnoreCase("name") && value instanceof String) {
			student.setName((String)value);
		}
		else if(fieldName.equalsIgnoreCase("degree") && value instanceof String) {
			student.setDegree((String)value);
		}
		else {
			System.out.println("field or value not present.");
		}
		
		transaction.commit();
		session.close();
		
		return student;

	}
	
	@SuppressWarnings("removal")
	public static String removeData(int id) {
		Session session = BuildConnection.getConnection().openSession();
		Transaction transaction = session.beginTransaction();
		
		Student student = session.getReference(Student.class, id);
		
		if(student != null) {
			session.remove(student);
			transaction.commit();
			session.close();
			return "data deleted successfully.";
		}
		else {
			transaction.commit();
			session.close();
			return "Id is not there.";
		}
	}
}
