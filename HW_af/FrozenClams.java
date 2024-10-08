
public class FrozenClams extends Clams {
	
	public FrozenClams(Pizza pizza) {
		this.pizza = pizza;
	}
 
	public String getDescription() {
		return pizza.getDescription() + ", Frozen Clams from Chesapeake Bay";
	}
 
	public double cost() {
		return 0.7 + pizza.cost(); 
	}
}
