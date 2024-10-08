
public class PlumTomatoSauce extends Sauce {
	
	public PlumTomatoSauce(Pizza pizza) {
		this.pizza = pizza;
	}
 
	public String getDescription() {
		return pizza.getDescription() + ", Tomato sauce with plum tomatoes";
	}
 
	public double cost() {
		return 0.2 + pizza.cost(); 
	}
}
