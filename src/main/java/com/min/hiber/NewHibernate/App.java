package com.min.hiber.NewHibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.min.hiber.services.Service;

/*
 *    <property name="connection.pool_size">1</property>
 *    Limits the number of connections waiting in the Hibernate database connection pool.
 * 
 */

public class App {

	
	public static void main(String[] args) {

		/*
		 * Books book=new Books("Java Core","Jemsh Goslin"); Books book1=new
		 * Books("Spring Core","Spring Goslin"); Student student=new
		 * Student("Iqbal Ali",book); Student student1=new
		 * Student("Tushar",book1); SessionFactory
		 * sfactory=HibernateUtil.getSessionFactory(); Session
		 * session=sfactory.openSession(); Transaction
		 * tr=session.beginTransaction(); session.save(student);
		 * session.save(student1); tr.commit(); session.close();
		 */

		System.out.println("Hello World!");

		Product pro = new Product("Samsung", 500000, "Sanju");
		Product pro1 = new Product("Apple", 500000, "Sanju2423");
		Service.addProduct(pro);
		Service.addProduct(pro1);

		Session session = Service.sfactory.openSession();
		Query query = session.createQuery("from Product");
		List list = query.list();

		
		System.out.println(list);
		
		/*
		 * Session session = HibernateUtil.getSessionFactory().openSession();
		 * Transaction transaction = null; try { transaction =
		 * session.beginTransaction(); Address address = new Address("OMR Road",
		 * "Chennai", "TN", "600097"); Student student = new Student("Eswar",
		 * address); session.save(student); transaction.commit(); } catch
		 * (HibernateException e) { transaction.rollback(); e.printStackTrace();
 		 * } finally { session.close(); }
		 */

		/* System.out.println(sfactory.hashCode()); */

		/*
		 * Session session=sfactory.getCurrentSession(); Session
		 * session1=sfactory.getCurrentSession();
		 */
		/*
		 * System.out.println(session.hashCode());
		 * System.out.println(session1.hashCode());
		 */

		/*
		 * Configuration conf = new Configuration(); SessionFactory sfactory =
		 * conf.configure().buildSessionFactory();
		 * System.out.println(sfactory.hashCode());
		 */
		/*
		 * Product p1 = new Product(101, "Vivo Node Pro", 23433, "Oppo");
		 * Product p2 = new Product(10, "Samsung", 15000, "samsung"); Product p3
		 * = new Product(13, "Samsung J2", 150500, "samsung"); Product p4 = new
		 * Product(14, "Samsung S1", 120000, "samsung"); Product p5 = new
		 * Product(15, "Samsung Galaxy", 350000, "samsung");
		 * 
		 * App.addProduct(p1); App.addProduct(p2); App.addProduct(p3);
		 * App.addProduct(p4); App.addProduct(p5);
		 */

		/*
		 * Session session = sfactory.openSession(); Transaction tr =
		 * session.beginTransaction(); session.save(p1); session.save(p2);
		 * session.save(p3); session.save(p4); session.save(p5);
		 * session.flush(); tr.commit();
		 */
	}
}
