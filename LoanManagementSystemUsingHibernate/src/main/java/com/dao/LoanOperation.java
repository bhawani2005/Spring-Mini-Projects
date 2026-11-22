package com.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.connection.ConnectionProvider;
import com.entity.Loan;

public class LoanOperation {

	public static String createALoan(Loan loan) {
		
		Session session = ConnectionProvider.getConnection().openSession();
		Transaction transaction = session.beginTransaction();
		
		session.persist(loan);
		
		transaction.commit();
		session.close();
		
		return "Loan created successfully.";
		
	}
	
	@SuppressWarnings("removal")
	public static Loan retriveALoan(int id) {
		Session session = ConnectionProvider.getConnection().openSession();
		Transaction transaction = session.beginTransaction();
		
		Loan loan = session.get(Loan.class, id);
		
		transaction.commit();
		session.close();
		
		return loan;
	}
	
	@SuppressWarnings("removal")
	public static List<Loan> retriveAllLoan(List<Loan> data){
		Session session = ConnectionProvider.getConnection().openSession();
		Transaction transaction = session.beginTransaction();
		
		List<Loan> list = new ArrayList<Loan>();
		
		for (Loan l : data) {
			Loan loan = session.get(Loan.class, l.getLoanId());
			list.add(loan);
		}
		
		transaction.commit();
		session.close();
		
		return list;
	}
	
	public static Loan updateALoan(int id, String status, double interestRate) {
		Session session = ConnectionProvider.getConnection().openSession();
		Transaction transaction = session.beginTransaction();
		
		Loan loan = session.getReference(Loan.class, id);
		loan.setLoanStatus(status);
		loan.setInterestRate(interestRate);
		
		transaction.commit();
		session.close();
		
		return loan;
	}
	
	public static String deleteALoan(int id) {
		Session session = ConnectionProvider.getConnection().openSession();
		Transaction transaction = session.beginTransaction();
		
		String msg = "";
		Loan loan = session.getReference(Loan.class, id);
		
		if (loan!=null) {
			session.remove(loan);
			msg = "Loan deleted successfully.";
		}
		else {
			msg = "Loan not found";
		}
		
		transaction.commit();
		session.close();
		
		return msg;
	}
}
