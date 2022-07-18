package com.hibernat.HibernatPrgm;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class CriteriaAPI_3_OrderByDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration con = new Configuration().configure().addAnnotatedClass(BookDetails.class);
    	SessionFactory sf = con.buildSessionFactory();		
		Session session = sf.openSession();
		
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<BookDetails> criteriaQuery = builder.createQuery(BookDetails.class);
		Root<BookDetails> root = criteriaQuery.from(BookDetails.class);
		criteriaQuery.select(root);
		
		criteriaQuery.orderBy(builder.asc(root.get("bookName")));
		Query<BookDetails> query = session.createQuery(criteriaQuery);
		List<BookDetails> bookList = query.list();	
		bookList.forEach(System.out::println);
	
	
	}

}
