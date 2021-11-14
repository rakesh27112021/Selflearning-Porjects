package springdemonew.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Pizzahut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("springdemonew/autowiring/beans.xml");
		

		Meal meal = (Meal) context.getBean("meal1");
		System.out.println(meal);
	}

}
