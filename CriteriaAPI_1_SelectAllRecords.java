package com.hibernat.HibernatPrgm;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class CriteriaAPI_1_SelectAllRecords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration con = new Configuration().configure().addAnnotatedClass(BookDetails_AutoIncrement.class);
    	SessionFactory sf = con.buildSessionFactory();		
		Session session = sf.openSession();
		
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<BookDetails_AutoIncrement> criteriaQuery = builder.createQuery(BookDetails_AutoIncrement.class);
		Root<BookDetails_AutoIncrement> root = criteriaQuery.from(BookDetails_AutoIncrement.class);
		criteriaQuery.select(root);
		Query<BookDetails_AutoIncrement> query = session.createQuery(criteriaQuery);
		
		List<BookDetails_AutoIncrement> bookList = query.list();
		bookList.forEach(System.out::println);
	
	
	}

}
