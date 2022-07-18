package com.hibernat.HibernatPrgm;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
/**
 * Hello world!
 *
 */
public class App_2_Retrieve 
{
    public static void main( String[] args )
    {

    	Configuration con = new Configuration().configure().addAnnotatedClass(BookDetails.class);
    	SessionFactory sf = con.buildSessionFactory();
    	Session session  = sf.openSession();
    	Transaction tx = session.beginTransaction();
    	
    	BookDetails bd = session.get(BookDetails.class, 1); // is used to retrieve the data
   
    	System.out.println("The record retrieved is: " + bd.toString());
    	tx.commit();
    	session.close();
    	
    }
}
