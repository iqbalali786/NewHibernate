package com.min.hiber.services;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.min.hiber.NewHibernate.Product;

public class Service {
	
	
	public static SessionFactory sfactory = null;
	static {

		Configuration config = new Configuration();
		sfactory = config.configure().buildSessionFactory();
	}

	public static void addProduct(Product p) {

		Session session = sfactory.openSession();
		Transaction tr = session.beginTransaction();
		session.save(p);
		tr.commit();
		session.close();

	}


}
