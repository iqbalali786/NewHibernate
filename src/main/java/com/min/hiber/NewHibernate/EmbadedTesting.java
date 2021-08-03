package com.min.hiber.NewHibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class EmbadedTesting {
	
	
	public static void main(String[] args) {
		
		Vehicle vehHome=new Vehicle(5050, "Honda", "4");
		Vehicle vehicle=new Vehicle(6060,"TVS","5");
		Person person=new Person("Pound","Male",new Date());
		person.setVehicleHome(vehHome);
		person.setVehicle(vehicle);
		
		SessionFactory sFactory=HibernateUtil.getSessionFactory();
		Session session=sFactory.openSession();
		Transaction tr=session.beginTransaction();
		session.save(person);
		tr.commit();
		session.close();
		
	}

}
