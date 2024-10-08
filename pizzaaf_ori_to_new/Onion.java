
public class Onion extends Veggies {

	public Onion(Pizza pizza) {
		this.pizza = pizza;
	}
 
	public String getDescription() {
		return pizza.getDescription() + ", Onion";
	}
 
	public double cost() {
		return 0.1 + pizza.cost(); 
	}
}
