package springdemonew;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Pizzahut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("springdemonew/beans.xml");
		
		Pizza pizza = (Pizza) context.getBean("pizza");
		pizza.displayPizza();
		System.out.println(pizza);
		
		Pizza pizza2 = (Pizza) context.getBean("pizza2");
		pizza2.displayPizza();
		System.out.println(pizza2);
		
		Pizza pizza3 = (Pizza) context.getBean("pizza3");
		pizza3.displayPizza();
		System.out.println(pizza3);
		
		Drink drink = (Drink) context.getBean("drink1");
		System.out.println(drink);
		
		drink = (Drink) context.getBean("drink2");
		System.out.println(drink);

		Meal meal = (Meal) context.getBean("meal1");
		System.out.println(meal);
		meal = (Meal) context.getBean("meal2");
		System.out.println(meal);
		meal = (Meal) context.getBean("meal3");
		System.out.println(meal);

	}

}
