package SpringCore.MyFirstSpringApplication;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
		/*
		 * Person A = new Person(); Person B = new Person();
		 */
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("SpringCore/MyFirstSpringApplication/application-context.xml");
    	Person bean = (Person)context.getBean("person");
    	System.out.println(bean);
    }
}
