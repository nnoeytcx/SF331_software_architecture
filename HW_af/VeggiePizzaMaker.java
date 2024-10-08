
public class VeggiePizzaMaker {
	PizzaIngredientFactory ingredientFactory;

	public VeggiePizzaMaker(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
 
	Pizza make(Pizza pizza)
	{
		pizza = ingredientFactory.getDough();
		pizza = ingredientFactory.getSauce(pizza);
		pizza = ingredientFactory.getCheese(pizza);
		pizza = ingredientFactory.getVeggies(pizza);
		return (pizza);
	}

}
