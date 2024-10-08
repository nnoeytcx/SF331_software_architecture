
public class Spinach extends Veggies {

	public Spinach(Pizza pizza) {
		this.pizza = pizza;
	}
 
	public String getDescription() {
		return pizza.getDescription() + ", Spinach";
	}
 
	public double cost() {
		return 0.2 + pizza.cost(); 
	}
}
