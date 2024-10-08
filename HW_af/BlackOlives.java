
public class BlackOlives extends Veggies {

	public BlackOlives(Pizza pizza) {
		this.pizza = pizza;
	}
 
	public String getDescription() {
		return pizza.getDescription() + ", Black Olives";
	}
 
	public double cost() {
		return 0.1 + pizza.cost(); 
	}
}
