
public class Mushroom extends Veggies {

	public Mushroom(Pizza pizza) {
		this.pizza = pizza;
	}
 
	public String getDescription() {
		return pizza.getDescription() + ", Mushrooms";
	}
 
	public double cost() {
		return 0.25 + pizza.cost(); 
	}
}
