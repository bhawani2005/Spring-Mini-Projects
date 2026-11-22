package util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory factory= null;
	
	private HibernateUtil() {
		
	}
	
	public static SessionFactory getFactory() {
		
		if(factory == null) {
			Configuration cnf = new Configuration();
			cnf.configure("resource/hibernate-cnf.xml");
			
			factory = cnf.buildSessionFactory();
		}
		
		return factory;
	}
}
