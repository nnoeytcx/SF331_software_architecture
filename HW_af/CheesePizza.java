public class CheesePizza extends Pizza {
	PizzaIngredientFactory ingredientFactory;

	public CheesePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	Pizza make(Pizza pizza)
	{
		pizza = ingredientFactory.getDough();
		pizza = ingredientFactory.getSauce(pizza);
		pizza = ingredientFactory.getCheese(pizza);
		return (pizza);
	}


	public double cost() {
		return this.cost();
	}
}
