
public class SlicedPepperoni extends Pepperoni {

	public SlicedPepperoni(Pizza pizza) {
		this.pizza = pizza;
	}
 
	public String getDescription() {
		return pizza.getDescription() + ", Sliced Pepperoni";
	}
 
	public double cost() {
		return 0.4 + pizza.cost(); 
	}
}
