
public class RedPepper extends Veggies {

	public RedPepper(Pizza pizza) {
		this.pizza = pizza;
	}
 
	public String getDescription() {
		return pizza.getDescription() + ", Red pepper";
	}
 
	public double cost() {
		return 0.8 + pizza.cost(); 
	}
}
