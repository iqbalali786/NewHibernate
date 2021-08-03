package com.min.hiber.criteriatest;

import java.util.Date;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.min.hiber.NewHibernate.HibernateUtil;
import com.min.hiber.mapping.User;
import com.min.hiber.mapping.Vehicle;

public class App {

	/*
	 * Actors actor1 = new Actors("Salman Khan", "Dabang 3", new Date()); Actors
	 * actor2 = new Actors("Shahrukh Khan", "Bandhan", new Date()); Actors
	 * actor3 = new Actors("Ajay Devgan", "Kante", new Date()); Actors actor4 =
	 * new Actors("Akshay Kumar", "Kiladi", new Date());
	 */

	public static void main(String[] args) throws SecurityException, RollbackException, HeuristicMixedException,
			HeuristicRollbackException, SystemException {

		Vehicle vehicle = new Vehicle("Hero Honda", "Hero");
		Vehicle vehicle1 = new Vehicle("Honda Shine", "Honda");
		User user = new User("iqbal ali", 26, "pune", new Date());
		user.getVehicles().add(vehicle);
		user.getVehicles().add(vehicle1);
		SessionFactory sfactory = HibernateUtil.getSessionFactory();
		Session session = sfactory.openSession();
		Transaction tr = session.beginTransaction();
		session.save(vehicle);
		session.save(vehicle1);
		session.save(user);
		tr.commit();

		session.close();

	}

}
