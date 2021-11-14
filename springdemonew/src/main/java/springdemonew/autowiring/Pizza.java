package springdemonew.autowiring;

public class Pizza {
	private String name;
	private String category;
	private String crust;
	private double cost;
	
	
	public Pizza() {
		System.out.println("Pizza is being prepared...");
	}

	public void displayPizza() {
		System.out.println("Pizza is ready...");
	}
	
	

	@Override
	public String toString() {
		return "Pizza [name=" + name + ", category=" + category + ", crust=" + crust + ", cost=" + cost + "]";
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		System.out.println("We are in pizza setname...");
		this.name = name;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public String getCrust() {
		return crust;
	}


	public void setCrust(String crust) {
		this.crust = crust;
	}


	public double getCost() {
		return cost;
	}


	public void setCost(double cost) {
		this.cost = cost;
	}

	
	
}
