package com.hibernat.HibernatPrgm;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Mapping_OneToMany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cart cart = new Cart(100, "First Cart");

		Items rice = new Items(1001, "Rice", 324.65f, cart);
		Items oil = new Items(1002, "Oil", 772.53f, cart);
		Items dhall = new Items(1003, "Dhall", 526.36f, cart);
		Items bread = new Items(1004, "Bread", 532.61f, cart);

		List<Items> allItems = new ArrayList<Items>();

		allItems.add(rice);
		allItems.add(oil);
		allItems.add(dhall);
		allItems.add(bread);

		cart.setItems(allItems);
		cart.settotalItems(allItems.size());

		Configuration con = new Configuration().configure().addAnnotatedClass(Cart.class)
				.addAnnotatedClass(Items.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		session.save(cart);

		tx.commit();

	}

}
