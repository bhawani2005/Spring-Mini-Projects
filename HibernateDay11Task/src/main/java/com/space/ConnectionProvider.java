package com.space;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ConnectionProvider {

	private static SessionFactory factory;
	
	private ConnectionProvider() {
		
	}
	
	public static SessionFactory getFactory() {
		
		if(factory == null) {
			Configuration cnf = new Configuration();
			cnf.configure("com/space/hibernate-cnf.xml");
			
			factory = cnf.buildSessionFactory();
		}
		
		return factory;
	}
}
