package springdemonew.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdbcMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("springdemonew/jdbc/beans.xml");

		CustomerDaoImp daoImp = (CustomerDaoImp) context.getBean("CustomerDaoImp");
		
		//Customer customer = new Customer (1,"Rakesh","haldwani");
		
	
		Customer customer = new Customer (2,"Sonika","haldwani");
		daoImp.addCustomer(customer);
	}

}
