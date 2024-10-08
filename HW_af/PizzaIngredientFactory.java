
public abstract class PizzaIngredientFactory {
 
	//public Dough createDough();
	//public Sauce createSauce();
	// public Cheese createCheese();
	// public Veggies[] createVeggies();
	// public Pepperoni createPepperoni();
	// public Clams createClam();
	public abstract Pizza getDough();

	public abstract Pizza getSauce(Pizza pizza);
	public abstract Pizza getCheese(Pizza pizza);
	public abstract Pizza getVeggies(Pizza pizza);
	public abstract Pizza getPepperoni(Pizza pizza);
	public abstract Pizza getClam(Pizza pizza);
}
