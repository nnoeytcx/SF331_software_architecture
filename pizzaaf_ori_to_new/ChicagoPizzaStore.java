
public class ChicagoPizzaStore extends PizzaStore {

	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory =
		new ChicagoPizzaIngredientFactory();

		if (item.equals("cheese")) {

			CheesePizza cheesePizza = new CheesePizza(ingredientFactory);
			pizza = cheesePizza.make(pizza);
			pizza.setName("Chicago Style Cheese Pizza");

		} else if (item.equals("veggie")) {

			VeggiePizza veggiepizza = new VeggiePizza(ingredientFactory);
			pizza = veggiepizza.make(pizza);
			pizza.setName("Chicago Style Veggie Pizza");

		} else if (item.equals("clam")) {

			ClamPizza clampizza = new ClamPizza(ingredientFactory);
			pizza = clampizza.make(pizza);
			pizza.setName("Chicago Style Clam Pizza");

		} else if (item.equals("pepperoni")) {

			PepperoniPizza pepperonipizza = new PepperoniPizza(ingredientFactory);
			pizza = pepperonipizza.make(pizza);
			pizza.setName("Chicago Style Pepperoni Pizza");

		}
		return pizza;
	}
}
