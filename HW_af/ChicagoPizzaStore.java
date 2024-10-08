
public class ChicagoPizzaStore extends PizzaStore {

	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory =
		new ChicagoPizzaIngredientFactory();

		if (item.equals("cheese")) {

			CheesePizzaMaker cheesePizzaMaker = new CheesePizzaMaker(ingredientFactory);
			pizza = cheesePizzaMaker.make(pizza);
			pizza.setName("Chicago Style Cheese Pizza");

		} else if (item.equals("veggie")) {

			VeggiePizzaMaker veggiepizzaMaker = new VeggiePizzaMaker(ingredientFactory);
			pizza = veggiepizzaMaker.make(pizza);
			pizza.setName("Chicago Style Veggie Pizza");

		} else if (item.equals("clam")) {

			ClamPizzaMaker clampizzaMaker = new ClamPizzaMaker(ingredientFactory);
			pizza = clampizzaMaker.make(pizza);
			pizza.setName("Chicago Style Clam Pizza");

		} else if (item.equals("pepperoni")) {

			PepperoniPizzaMaker pepperonipizzaMaker = new PepperoniPizzaMaker(ingredientFactory);
			pizza = pepperonipizzaMaker.make(pizza);
			pizza.setName("Chicago Style Pepperoni Pizza");

		}
		return pizza;
	}
}
