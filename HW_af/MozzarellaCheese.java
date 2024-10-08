
public class MozzarellaCheese extends Cheese {

	public MozzarellaCheese(Pizza pizza) {
		this.pizza = pizza;
	}
 
	public String getDescription() {
		return pizza.getDescription() + ", Shredded Mozzarella";
	}
 
	public double cost() {
		return 0.5 + pizza.cost(); 
	}
}
