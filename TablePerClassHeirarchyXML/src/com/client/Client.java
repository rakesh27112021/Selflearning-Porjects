package com.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.beans.Contract_Employee;
import com.beans.Employee;
import com.beans.Regular_Employee;
import com.util.HibernateUtil;

public class Client {
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		
		Session session = factory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		Employee emp1 = new Employee();
		emp1.setName("Soni1");
		
		Regular_Employee emp2 = new Regular_Employee();
		emp2.setName("Vikky");
		emp2.setSalary(100);
		emp2.setBonus(50);
		
		Contract_Employee emp3 = new Contract_Employee();
		emp3.setName("Bhayya");
		emp3.setContract_duration("10moths");
		emp3.setPay_per_hour(2.5f);
		
		session.save(emp1);
		session.save(emp2);
		session.save(emp3);
		transaction.commit();
		
		factory.close();
		
	}
}
