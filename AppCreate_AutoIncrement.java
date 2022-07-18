package com.hibernat.HibernatPrgm;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
/**
 * Hello world!
 *
 */
public class AppCreate_AutoIncrement 
{
    public static void main( String[] args )
    {

    	BookDetails_AutoIncrement bd = new BookDetails_AutoIncrement();
    	
    	//bd.setBookId(102);
    	bd.setBookName("RestAPI");
    	bd.setBookPrice(976.12f);
    	
    	Configuration con = new Configuration().configure().addAnnotatedClass(BookDetails_AutoIncrement.class);
    	SessionFactory sf = con.buildSessionFactory();
    	Session session  = sf.openSession();
    	
    	Transaction tx = session.beginTransaction();
    	session.save(bd);
    	tx.commit();
    	
    }
}
