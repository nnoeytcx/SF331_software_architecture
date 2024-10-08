
public class NYPizzaStore extends PizzaStore {
 
	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = 
			new NYPizzaIngredientFactory();
 
		if (item.equals("cheese")) {
  
			CheesePizzaMaker cheesePizzaMaker = new CheesePizzaMaker(ingredientFactory);
			pizza = cheesePizzaMaker.make(pizza);
			pizza.setName("New York Style Cheese Pizza");
  
		} else if (item.equals("veggie")) {
			VeggiePizzaMaker veggiepizzaMaker = new VeggiePizzaMaker(ingredientFactory);
			pizza = veggiepizzaMaker.make(pizza);
			pizza.setName("New York Style Veggie Pizza");
 
		} else if (item.equals("clam")) {
			ClamPizzaMaker clampizzaMaker = new ClamPizzaMaker(ingredientFactory);
			pizza = clampizzaMaker.make(pizza);
			pizza.setName("New York Style Clam Pizza");
 
		} else if (item.equals("pepperoni")) {
			PepperoniPizzaMaker pepperonipizzaMaker = new PepperoniPizzaMaker(ingredientFactory);
			pizza = pepperonipizzaMaker.make(pizza);
			pizza.setName("New York Style Pepperoni Pizza");
 
		} 
		return pizza;
	}
}
