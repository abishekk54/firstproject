package ques1;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateUtil {
	
	public static SessionFactory factory;
	public static SessionFactory getSessionFactory(){
		if(factory==null){
			factory=new AnnotationConfiguration().configure().buildSessionFactory();
		}
		return factory;
	}

}
