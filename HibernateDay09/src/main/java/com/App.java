package com;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        Configuration cnf = new Configuration();
        cnf.configure("com/hibernate-cnf.xml");
        
        SessionFactory factory = cnf.buildSessionFactory();
        
        Question que1 = new Question();
        que1.setQuestion("What is Java.");
        
        Question que2 = new Question();
        que2.setQuestion("What are the Fetures of Java.");
        
        Question que3 = new Question();
        que3.setQuestion("What is Hibernate");
        
        
        Answer ans1 = new Answer();
        ans1.setAnswer("Java is a Plateform independent.");
        
        Answer ans2 = new Answer();
        ans2.setAnswer("Java is a programming language ment to be build a internate softwear");
        
        Answer ans3 = new Answer();
        ans3.setAnswer("Hibernate is a ORM Tech.");
        
        Answer ans4 = new Answer();
        ans4.setAnswer("Hibernate follows JPA Rule");
        
        Answer ans5 = new Answer();
        ans5.setAnswer("Java is a Robust");
        
        List<Question> questions1 = new ArrayList<Question>();
        questions1.add(que1);
        questions1.add(que2);
        
        ans1.setQuestions(questions1);
        ans5.setQuestions(questions1);
        
        
        List<Question> questions2 = new ArrayList<Question>();
        questions2.add(que1);
        
        ans2.setQuestions(questions2);
        
        List<Question> questions3 = new ArrayList<Question>();
        questions3.add(que3);
        
        ans3.setQuestions(questions3);
        ans4.setQuestions(questions3);
  
        
        List<Answer> answers1 = new ArrayList<Answer>();
        answers1.add(ans1);
        answers1.add(ans2);
        answers1.add(ans5);
        
        que1.setAnswers(answers1);
        
        
        List<Answer> answers2 = new ArrayList<Answer>();
        answers2.add(ans1);
        answers2.add(ans5);
        
        que2.setAnswers(answers2);
        
        List<Answer> answers3 = new ArrayList<Answer>();
        answers3.add(ans3);
        answers3.add(ans4);
        
        que3.setAnswers(answers3);
        
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        
        session.persist(que1);
        session.persist(que2);
        session.persist(que3);
        
        session.persist(ans1);
        session.persist(ans2);
        session.persist(ans3);
        session.persist(ans4);
        session.persist(ans5);
        
        transaction.commit();
        session.close();
        
        Session session2 = factory.openSession();
        Question reference = session2.getReference(Question.class, 1);
        
        System.out.println("Question: ");
        System.out.println(reference.getQuestion());
        System.out.println("Answers: ");
        for(Answer q : reference.getAnswers()) {
        	System.out.println(q);
        }
        
        session2.close();
        
    }
}
