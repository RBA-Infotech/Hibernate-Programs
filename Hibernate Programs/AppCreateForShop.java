package com.hibernat.HibernatPrgm;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AppCreateForShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// to create shop table which contains product info
		
		ShopDetails sd = new ShopDetails();
		
		sd.setProductID(102);
		sd.setProductName("Rice");
		sd.setProductPrice(234.81f);	

		Configuration con = new Configuration().configure().addAnnotatedClass(ShopDetails.class);
		SessionFactory sf = con.buildSessionFactory();  // group of session
		Session session = sf.openSession(); // one session 
		
		Transaction tx = session.beginTransaction();
		session.save(sd);
		tx.commit();
		session.close();
		
	}

}
