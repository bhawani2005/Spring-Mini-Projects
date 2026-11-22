package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import model.Address;
import model.Patient;
import util.HibernateUtil;

public class PatientDAO {

	public static String registerPatient(Patient patient) {
		SessionFactory factory = HibernateUtil.getFactory();

		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		session.persist(patient);

		transaction.commit();
		session.close();

		return "Register Successfully.";
	}

	@SuppressWarnings("removal")
	public static List<Patient> displayAllPatient(List<Patient> data) {
		SessionFactory factory = HibernateUtil.getFactory();

		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		List<Patient> result = new ArrayList<Patient>();

		for (Patient p : data) {
			Patient patient = session.get(Patient.class, p.getId());
			result.add(patient);
		}
		
		transaction.commit();
		session.close();

		return result;
	}
	
	@SuppressWarnings("removal")
	public static Patient searchPatientById(int id) {
		Session session = HibernateUtil.getFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
		Patient patient = session.get(Patient.class, id);
		
		transaction.commit();
		session.close();
		
		return patient;
	}
	
	public static Patient updatePatient(int id, Address address) {
		
		Session session = HibernateUtil.getFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
		Patient patient = session.getReference(Patient.class, id);
		patient.setAddress(address);
		
		transaction.commit();
		session.close();
		
		return patient;
	}
	
	public static String deletePatient(int id) {
		Session session = HibernateUtil.getFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
		Patient patient = session.getReference(Patient.class, id);
		session.remove(patient);
		
		transaction.commit();
		session.close();
		
		return "Deleted patient successfully.";
	}
}
