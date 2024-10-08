public class CheesePizzaMaker{
	PizzaIngredientFactory ingredientFactory;

	public CheesePizzaMaker(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	Pizza make(Pizza pizza)
	{
		pizza = ingredientFactory.getDough();
		pizza = ingredientFactory.getSauce(pizza);
		pizza = ingredientFactory.getCheese(pizza);
		return (pizza);
	}

}
