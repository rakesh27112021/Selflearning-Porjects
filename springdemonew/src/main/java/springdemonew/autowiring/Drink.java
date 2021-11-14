package springdemonew.autowiring;

public class Drink {

	private String name;
	private String category;
	private double cost;
	public Drink(String name, String category, double cost) {
		super();
		this.name = name;
		this.category = category;
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Drink [name=" + name + ", category=" + category + ", cost=" + cost + "]";
	}
	
	
}
