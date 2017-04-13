package ques1.c;




import java.util.Iterator;
import java.util.List;

import javax.persistence.ElementCollection;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class LoadDb {
	public static void main(String[] args) {
		
	Session session= 	new AnnotationConfiguration().configure().buildSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		
		Query query=session.createQuery("from WwfEvent");
		List list=query.list();
		System.out.println(list.size());
		for (Object object : list) {
			
			System.out.println(object);
		}
	Iterator itr=	list.iterator();
	while(itr.hasNext()){
		Object obj=itr.next();
		System.out.println(obj);
	}
		
		
		
		transaction.commit();
		session.close();
		
	}

}
