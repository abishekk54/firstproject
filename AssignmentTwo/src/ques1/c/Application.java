package ques1.c;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Application {
	public static void main(String[] args) {
		Session session = new AnnotationConfiguration().configure()
				.buildSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		
		WwfFeedback f1=new WwfFeedback("good","rahul");
		WwfFeedback f2=new WwfFeedback("not good","amit");
		WwfFeedback f3=new WwfFeedback("good","avinash");
		WwfFeedback f4=new WwfFeedback("good","vishal");
		
		
		Set<WwfFeedback>set1=new HashSet<WwfFeedback>();
		set1.add(f1);
		set1.add(f2);
		
		
		Set<WwfFeedback>set2=new HashSet<WwfFeedback>();
		set2.add(f4);
		set2.add(f3);
		
		WwfEvent event1=new  WwfEvent("Singing", "4 to 6");
		event1.setFeedbacks(set2);
		
		
		WwfEvent event2=new WwfEvent("dancing","6 to 8");
		event2.setFeedbacks(set1);
		session.save(event1);
		session.save(event2);
		try{
			transaction.commit();
		}catch(Exception e){
			System.out.println("constraint voilation");
		}
		
		
		
		
		
		session.close();
	}

}
