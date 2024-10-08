
public class PepperoniPizzaMaker {
	PizzaIngredientFactory ingredientFactory;

	public PepperoniPizzaMaker(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
 
	Pizza make(Pizza pizza)
	{
		pizza = ingredientFactory.getDough();
		pizza = ingredientFactory.getSauce(pizza);
		pizza = ingredientFactory.getCheese(pizza);
		pizza = ingredientFactory.getVeggies(pizza);
		pizza = ingredientFactory.getPepperoni(pizza);
		return (pizza);
	}

}
