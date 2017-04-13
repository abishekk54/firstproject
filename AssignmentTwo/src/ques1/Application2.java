package ques1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Application2 {
	public static void main(String[] args) {
		Session session=HibernateUtil.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		
		EventTwo eventTwo1=new EventTwo("dancing","4 to 5");
		EventTwo eventTwo2=new EventTwo("singing","6 to 7");
		
		FeedBack2 f1=new FeedBack2("good","rahul");
		FeedBack2 f2=new FeedBack2("not good", "rohan");
		FeedBack2 f3=new FeedBack2("good","kapil");
		FeedBack2 f4=new FeedBack2("good","Suresh");
		
		List<FeedBack2>list1=new ArrayList<FeedBack2>();
		list1.add(f1);
		list1.add(f2);
		
		List<FeedBack2>list2=new ArrayList<FeedBack2>();
		list2.add(f3);
		list2.add(f4);
		
		eventTwo1.setList(list1);
		session.save(eventTwo1);
		
		eventTwo2.setList(list2);
		session.save(eventTwo2);
		
		Query query=session.createQuery("from EventTwo");
		List list=query.list();
		for (Object object : list) {
			
			System.out.println(object);
		}
				
		
		transaction.commit();
		session.close();
	}

}
