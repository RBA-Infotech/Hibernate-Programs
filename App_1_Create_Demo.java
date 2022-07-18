package com.hibernat.HibernatPrgm;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App_1_Create_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		BookDetails bd = new BookDetails();
		
		bd.setBookId(1002);
		bd.setBookName("java Spring");
		bd.setBookPrice(409.62f);
		
		Configuration con = new Configuration().configure().addAnnotatedClass(BookDetails.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		session.save(bd);
		
		tx.commit();
		
	
	}

}
