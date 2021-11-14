package sprngdemonew.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Drink {

	@Value("Cold drink")
	private String name;
	@Value("Soft drink")
	private String category;
	@Value("101")
	private double cost;
	
	
	
	public Drink() {
		super();
		System.out.println("Drink is being prepared...");
	}
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
