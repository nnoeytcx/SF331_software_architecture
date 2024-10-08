
public class NYPizzaStore extends PizzaStore {
 
	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = 
			new NYPizzaIngredientFactory();
 
		if (item.equals("cheese")) {
  
			CheesePizza cheesePizza = new CheesePizza(ingredientFactory);
			pizza = cheesePizza.make(pizza);
			pizza.setName("New York Style Cheese Pizza");
  
		} else if (item.equals("veggie")) {
			VeggiePizza veggiepizza = new VeggiePizza(ingredientFactory);
			pizza = veggiepizza.make(pizza);
			pizza.setName("New York Style Veggie Pizza");
 
		} else if (item.equals("clam")) {
			ClamPizza clampizza = new ClamPizza(ingredientFactory);
			pizza = clampizza.make(pizza);
			pizza.setName("New York Style Clam Pizza");
 
		} else if (item.equals("pepperoni")) {
			PepperoniPizza pepperonipizza = new PepperoniPizza(ingredientFactory);
			pizza = pepperonipizza.make(pizza);
			pizza.setName("New York Style Pepperoni Pizza");
 
		} 
		return pizza;
	}
}
