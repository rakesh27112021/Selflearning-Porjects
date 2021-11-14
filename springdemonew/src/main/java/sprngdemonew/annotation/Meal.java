package sprngdemonew.annotation;

import org.springframework.stereotype.Component;

@Component
public class Meal {
	
	private Pizza pizza;
	private Drink drink;
	
	
	public Pizza getPizza() {
		return pizza;
	}
	public void setPizza(Pizza pizza) {
		this.pizza = pizza;
	}
	public Drink getDrink() {
		return drink;
	}
	public void setDrink(Drink drink) {
		this.drink = drink;
	}
	@Override
	public String toString() {
		return "Meal [pizza=" + pizza + ", drink=" + drink + "]";
	}
	
	

}
