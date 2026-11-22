package com;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

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
			Server webServer = Server.createWebServer("-web","-webPort","8084").start();
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	
        Configuration cnf = new Configuration();
        cnf.configure("com/hibernate-cnf.xml");
        
        SessionFactory factory = cnf.buildSessionFactory();
        
        Question que1 = new Question();
        que1.setQuestion("What is Java?");
        
        Question que2 = new Question();
        que2.setQuestion("What is Hibernate?");
        
        Answer ans1 = new Answer();
        ans1.setAnswer("Java is ment to be build a internate software.");
        ans1.setQuestion(que1);
        
        Answer ans2 = new Answer();
        ans2.setAnswer("Java is Platform independent.");
        ans2.setQuestion(que1);
        
        Answer ans3 = new Answer();
        ans3.setAnswer("Java is Rodust.");
        ans3.setQuestion(que1);
        
        Answer ans4 = new Answer();
        ans4.setAnswer("Hibernate is a ORM framwork.");
        ans4.setQuestion(que2);
        
        Answer ans5 = new Answer();
        ans5.setAnswer("Hibernate follow JPA Rule.");
        ans5.setQuestion(que2);
        
        List<Answer> data1 = Arrays.asList(ans1, ans2, ans3);
        List<Answer> data2 = Arrays.asList(ans4, ans5);
        
        que1.setAnswers(data1);
        que2.setAnswers(data2);
        
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        
        session.persist(que1);
        session.persist(que2);
        
        session.persist(ans1);
        session.persist(ans2);
        session.persist(ans3);
        session.persist(ans4);
        session.persist(ans5);
        
        transaction.commit();
        session.close();
        
        Session session2 = factory.openSession();
        
        Question reference = session2.getReference(Question.class, que1.getId());
        System.out.println("Que: ");
        System.out.println(reference.getQuestion());
        
        System.out.println("Ans: ");
        List<Answer> answers = reference.getAnswers();
        for (Answer answer : answers) {
			System.out.println(answer);
		}
        
        session2.close();
        
        
     }
}
