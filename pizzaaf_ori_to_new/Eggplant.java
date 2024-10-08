
public class Eggplant extends Veggies {

	public Eggplant(Pizza pizza) {
		this.pizza = pizza;
	}
 
	public String getDescription() {
		return pizza.getDescription() + ", Eggplant";
	}
 
	public double cost() {
		return 0.15 + pizza.cost(); 
	}
}
