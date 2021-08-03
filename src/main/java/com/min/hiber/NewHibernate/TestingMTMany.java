package com.min.hiber.NewHibernate;

import java.util.Date;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class TestingMTMany {

	public static void main(String[] args) {

		Producer producer1 = new Producer("Parle_company", new Date());
		Producer producer2 = new Producer("Oil_company", new Date());
		Consumer consumer1 = new Consumer("Iqbal Ali", "Male");
		Consumer consumer2 = new Consumer("Tushar Vaibhav", "Male");
		
		consumer1.getProducers().add(producer1);
		consumer1.getProducers().add(producer2);
		consumer2.getProducers().add(producer1);
		consumer2.getProducers().add(producer2);
		producer1.getConsumers().add(consumer1);
		producer1.getConsumers().add(consumer2);
		producer2.getConsumers().add(consumer1);
		producer2.getConsumers().add(consumer2);

		SessionFactory sfactory = HibernateUtil.getSessionFactory();
		Session session = sfactory.openSession();
		Transaction tr = session.beginTransaction();
		session.save(consumer1);
		session.save(consumer2);
		tr.commit();
		session.close();
	}
}
