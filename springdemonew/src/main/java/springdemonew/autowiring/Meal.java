package springdemonew.autowiring;

public class Meal {
	
	private String mealName;
	private Pizza pizza;
	private Drink drink;
	
	
	public String getMealName() {
		return mealName;
	}
	public void setMealName(String mealName) {
		this.mealName = mealName;
	}
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
		return "Meal [mealName=" + mealName + ", pizza=" + pizza + ", drink=" + drink + "]";
	}
	
	

}
