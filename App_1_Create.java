package com.hibernat.HibernatPrgm;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
/**
 *
 * Hello world!
 * 
 **/
public class App_1_Create 
{
    public static void main( String[] args )
    {

    	BookDetails bd = new BookDetails();
    	
    	bd.setBookId(1);
    	bd.setBookName("Java");
    	bd.setBookPrice(6549.95f);
    	
    	Configuration con = new Configuration().configure().addAnnotatedClass(BookDetails.class);
    	SessionFactory sf = con.buildSessionFactory();
    	Session session  = sf.openSession();
    	Transaction tx = session.beginTransaction();
    	
    	session.save(bd); // creating object it means creating one row in DB
    	
    //	session.persist(bd);
    	tx.commit();
    	
    }
}
