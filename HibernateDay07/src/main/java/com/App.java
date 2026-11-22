package com;

import java.sql.SQLException;

import org.h2.tools.Server;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {

		try {
			Server webServer = Server.createWebServer("-web", "-webPort", "8084").start();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		Configuration cnf = new Configuration();
		cnf.configure("com/hibernate-cnf.xml");

		SessionFactory factory = cnf.buildSessionFactory();

		Question que1 = new Question();
		que1.setQuestion("What is JVM?");

		Question que2 = new Question();
		que2.setQuestion("What is inheritance?");

		Question que3 = new Question();
		que3.setQuestion("What is polymorphism?");

		Answer ans1 = new Answer();
		ans1.setAnswer("Polymorphism allows one interface or method name to represent different behaviors.");

		Answer ans2 = new Answer();
		ans2.setAnswer("JVM executes Java bytecode.");

		Answer ans3 = new Answer();
		ans3.setAnswer("Inheritance allows one class to acquire the properties and methods of another class.");

        que1.setAnswer(ans2);
        que2.setAnswer(ans3);
        que3.setAnswer(ans1);
        
        ans1.setQuestion(que3);
        ans2.setQuestion(que1);
        ans3.setQuestion(que2);

		Session session1 = factory.openSession();
		Transaction transaction = session1.beginTransaction();

		session1.persist(que1);
		session1.persist(que2);
		session1.persist(que3);
		session1.persist(ans1);
		session1.persist(ans2);
		session1.persist(ans3);

		transaction.commit();
		session1.close();
		
		Session session2 = factory.openSession();
		Transaction transaction2 = session2.beginTransaction();
		
		Question reference = session2.getReference(Question.class, 1);
		System.out.println("Que: ");
		System.out.println(reference.getQuestion());
		System.out.println("Ans: ");
		System.out.println(reference.getAnswer().getAnswer());
		
		transaction2.commit();
		session2.close();
	}
}
