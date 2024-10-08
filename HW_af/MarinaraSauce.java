
public class MarinaraSauce extends Sauce {

	public MarinaraSauce(Pizza pizza) {
		this.pizza = pizza;
	}
 
	public String getDescription() {
		return pizza.getDescription() + ", Marinara Sauce";
	}
 
	public double cost() {
		return 0.3 + pizza.cost(); 
	}
}
