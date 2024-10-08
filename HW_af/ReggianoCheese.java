
public class ReggianoCheese extends Cheese {

	public ReggianoCheese(Pizza pizza) {
		this.pizza = pizza;
	}
 
	public String getDescription() {
		return pizza.getDescription() + ", Reggiano Cheese";
	}
 
	public double cost() {
		return 0.9 + pizza.cost(); 
	}
}
