
public abstract class Pizza {
	String name;

	String description = "Basic Pizza";

	public String getDescription() {
		return description;
	}
 
	public abstract double cost();


	void bake() {
		System.out.println("++ Bake for 25 minutes at 350");
	}

	void cut() {
		System.out.println("++ Cutting the pizza into diagonal slices");
	}

	void box() {
		System.out.println("++ Place pizza in official PizzaStore box");
	}

	void setName(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}

}
