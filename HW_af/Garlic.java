
public class Garlic extends Veggies {

	public Garlic(Pizza pizza) {
		this.pizza = pizza;
	}
 
	public String getDescription() {
		return pizza.getDescription() + ", Garlic";
	}
 
	public double cost() {
		return 0.1 + pizza.cost(); 
	}
}
