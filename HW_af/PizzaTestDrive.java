
import java.text.DecimalFormat;

import javax.print.DocFlavor;


public class PizzaTestDrive {

	private static final DecimalFormat df = new DecimalFormat("0.00");
 
	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
 
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Ethan ordered a " + pizza.getName());
		System.out.println("This pizza is consists of : " + pizza.getDescription());
		System.out.println("This pizza price is : " + df.format(pizza.cost()));
 
		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("Joel ordered a " + pizza.getName());
		System.out.println("This pizza is consists of : " + pizza.getDescription());
		System.out.println("This pizza price is : " + df.format(pizza.cost()));
 
		pizza = nyStore.orderPizza("clam");
		System.out.println("Ethan ordered a " + pizza.getName());
		System.out.println("This pizza is consists of : " + pizza.getDescription());
		System.out.println("This pizza price is : " + df.format(pizza.cost()));
 
		pizza = chicagoStore.orderPizza("clam");
		System.out.println("Joel ordered a " + pizza.getName());
		System.out.println("This pizza is consists of : " + pizza.getDescription());
		System.out.println("This pizza price is : " + df.format(pizza.cost()));
 
		pizza = nyStore.orderPizza("pepperoni");
		System.out.println("Ethan ordered a " + pizza.getName());
		System.out.println("This pizza is consists of : " + pizza.getDescription());
		System.out.println("This pizza price is : " + df.format(pizza.cost()));
 
		pizza = chicagoStore.orderPizza("pepperoni");
		System.out.println("Joel ordered a " + pizza.getName());
		System.out.println("This pizza is consists of : " + pizza.getDescription());
		System.out.println("This pizza price is : " + df.format(pizza.cost()));
 
		pizza = nyStore.orderPizza("veggie");
		System.out.println("Ethan ordered a " + pizza.getName());
		System.out.println("This pizza is consists of : " + pizza.getDescription());
		System.out.println("This pizza price is : " + df.format(pizza.cost()));
 
		pizza = chicagoStore.orderPizza("veggie");
		System.out.println("Joel ordered a " + pizza.getName());
		System.out.println("This pizza is consists of : " + pizza.getDescription());
		System.out.println("This pizza price is : " + df.format(pizza.cost()));
 
	}
}
