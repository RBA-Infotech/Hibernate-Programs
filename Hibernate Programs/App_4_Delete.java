package com.hibernat.HibernatPrgm;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
/**
 * Hello world!
 *
 */
public class App_4_Delete 
{
    public static void main( String[] args )
    {

    	Configuration con = new Configuration().configure().addAnnotatedClass(BookDetails.class);
    	SessionFactory sf = con.buildSessionFactory();
    	Session session  = sf.openSession();
    	Transaction tx = session.beginTransaction();
    	
    	BookDetails bd = session.get(BookDetails.class, 2);
    	session.delete(bd);
    	
    	tx.commit();
    	session.close();
    	
    }
}
