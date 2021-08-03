package com.min.hiber.NewHibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class TestingOneMany {
	
	public static void main(String[] args) {
		
		Books book=new Books("Java","Gosling");
		Books book1=new Books("Spring","Iqbal");
		Professor pro=new Professor("Singhal Sir");
		pro.getBooks().add(book);
		pro.getBooks().add(book1);
		//book.setProfessor(pro);
		
		Books book2=new Books("Python","python Gosling");
		Books book3=new Books("Spring","Tushar");
		Professor pro1=new Professor("S.P Sir");
		pro.getBooks().add(book2);
		pro.getBooks().add(book3);
		//book.setProfessor(pro1);
		
		
		SessionFactory sfactory=HibernateUtil.getSessionFactory();
		Session session=sfactory.openSession();
		Transaction tr=session.beginTransaction();
		session.save(pro);
		session.save(pro1);
		tr.commit();
		session.close();	
	}
}
