package com.hibernat.HibernatPrgm;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
/**
 * Hello world!
 *
 */
public class Mapping_OneToOne 
{
    public static void main( String[] args )
    {

    	Laptop laptop = new Laptop();
    	laptop.setLapId(101);
    	laptop.setLapName("Dell");
    	
    	Student stud = new Student();
    	stud.setStudId(1);
    	stud.setStudName("Anbu");
    	stud.setTotalMark(98);
    	stud.setLaptop(laptop);
    	
    	
    	Configuration con = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
    	SessionFactory sf = con.buildSessionFactory();
    	Session session  = sf.openSession();
    	Transaction tx = session.beginTransaction();
    	
    	session.save(laptop); 
    	session.save(stud);
    	
    	tx.commit();
    	
    }
}
