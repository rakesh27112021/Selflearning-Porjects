package com.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.beans.Student;
import com.util.HibernateUtil;

public class Client {
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		
		Session session = factory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		Student student1 = new Student("Sonika", "Bahuguna", 10);
		
		session.save(student1);
		transaction.commit();
		
		factory.close();
		
	}
}
