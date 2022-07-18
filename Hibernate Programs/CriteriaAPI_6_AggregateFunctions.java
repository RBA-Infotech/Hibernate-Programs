package com.hibernat.HibernatPrgm;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class CriteriaAPI_6_AggregateFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration con = new Configuration().configure().addAnnotatedClass(BookDetails.class);
    	SessionFactory sf = con.buildSessionFactory();		
		Session session = sf.openSession();
		
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Object[]> criteriaQuery = builder.createQuery(Object[].class);
		Root<BookDetails> root = criteriaQuery.from(BookDetails.class);
		criteriaQuery.multiselect( builder.count(root),
				builder.sum(root.get("bookPrice")),
				builder.avg(root.get("bookPrice")),
				builder.min(root.get("bookPrice")),
				builder.max(root.get("bookPrice")));
		
		Query<Object[]> query = session.createQuery(criteriaQuery);
		List<Object[]> list = query.list();
		
		Object[] obj = list.get(0);
		
		
		
		System.out.println("The Count is = " + obj[0]);
		System.out.println("The Sum is = " + obj[1]);
		System.out.println("The Average is = " + obj[2]);
		System.out.println("The Minimum is = " + obj[3]);
		System.out.println("The Maximum is = " + obj[4]);
	
	}

}
