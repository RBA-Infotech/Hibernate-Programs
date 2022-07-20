package com.hibernat.HibernatPrgm;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class Mapping_OneToOne {
	public static void main(String[] args) {

		
		Laptop laptop = new Laptop();
		laptop.setLapId(101);
		laptop.setLapName("Lenovo");

		Student stud = new Student();
		stud.setStudId(1);
		stud.setLapId(101);
		stud.setStudName("Anbu");
		stud.setTotalMark(74);
		stud.setLaptop(laptop);

		Configuration con = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		session.save(stud);

		tx.commit();

	}
}
