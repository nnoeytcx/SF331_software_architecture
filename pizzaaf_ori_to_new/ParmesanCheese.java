
public class ParmesanCheese extends Cheese {

	public ParmesanCheese(Pizza pizza) {
		this.pizza = pizza;
	}
 
	public String getDescription() {
		return pizza.getDescription() + ", Shredded Parmesan";
	}
 
	public double cost() {
		return  0.7 + pizza.cost();
	}
}
