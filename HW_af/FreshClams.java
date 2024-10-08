
public class FreshClams extends Clams {

	public FreshClams(Pizza pizza) {
		this.pizza = pizza;
	}
 
	public String getDescription() {
		return pizza.getDescription() + ", Fresh Clams from Long Island Sound";
	}
 
	public double cost() {
		return 1.2 + pizza.cost(); 
	}
}
