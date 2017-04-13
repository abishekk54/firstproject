package ques1;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class ApplicationOne {
	public static void main(String[] args) {
		Session session=HibernateUtil.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		
		Event event=new Event(11,"dancing");
		Set<String>set=new HashSet<String>();
		set.add("good");
		set.add("notgood");
		event.setFeedBack(set);
		session.save(event);
		
		transaction.commit();
		session.close();
	}

}
