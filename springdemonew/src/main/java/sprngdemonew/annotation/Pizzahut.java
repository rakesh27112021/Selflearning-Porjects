package sprngdemonew.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Pizzahut {

	public static void main(String[] args) {


		ApplicationContext context = new ClassPathXmlApplicationContext("sprngdemonew/annotation/beans.xml");
        Pizza pizza = (Pizza) context.getBean("pizza1");
        System.out.println(pizza);
        
        Drink drink = context.getBean(Drink.class);
        System.out.println(drink);
	}

}
