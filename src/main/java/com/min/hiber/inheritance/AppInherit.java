package com.min.hiber.inheritance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.min.hiber.NewHibernate.HibernateUtil;

/*
 * One extra Seperate column is DTYPE which is called Discriminator that contains name of the classes
*/

public class AppInherit {

	
	public static void main(String[] args) {
		
		Vehicle vehicle=new Vehicle();
		vehicle.setVehicleName("CAR");
		TwoWhealer twoWhealer=new TwoWhealer();
		twoWhealer.setVehicleName("Honda Shine");
		twoWhealer.setSteearingHandle("Streering Handle");
		FourWhealer fourWhealer=new FourWhealer();
		fourWhealer.setVehicleName("Swift_Desire");
		fourWhealer.setSteeringWheel("Steering wheal");
		
		SessionFactory sfactory=HibernateUtil.getSessionFactory();
		Session session=sfactory.openSession();
		Transaction tr=session.beginTransaction();
		session.save(vehicle);
		session.save(twoWhealer);
		session.save(fourWhealer);
		
		tr.commit();
		session.close();
		
	}
}
