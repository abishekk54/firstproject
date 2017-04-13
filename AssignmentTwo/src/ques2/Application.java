package ques2;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Application {
	public static void main(String[] args) {
		Session session=new AnnotationConfiguration().configure().buildSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		
		Manufacturer manufacturer=new Manufacturer(101,"rebook");
		Item item=new Item();
		item.setItemName("rbk_shoe");
		item.setCost(2500);
		item.setManufacturer(manufacturer);
		session.save(item);
		
		transaction.commit();
		session.close();
	}

}
