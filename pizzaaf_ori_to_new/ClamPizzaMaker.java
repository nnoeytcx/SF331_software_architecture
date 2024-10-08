
public class ClamPizzaMaker {
	PizzaIngredientFactory ingredientFactory;

	public ClamPizzaMaker(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
 
	Pizza make(Pizza pizza)
	{
		pizza = ingredientFactory.getDough();
		pizza = ingredientFactory.getSauce(pizza);
		pizza = ingredientFactory.getCheese(pizza);
		pizza = ingredientFactory.getClam(pizza);
		return (pizza);
	}

}
