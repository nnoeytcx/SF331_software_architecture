
public class NYPizzaIngredientFactory extends PizzaIngredientFactory {
 
	public Pizza getDough(){
		Pizza pizza = new ThincrustPizza();
		return pizza;
	}

	public Pizza getSauce(Pizza pizza)
	{
		pizza = new MarinaraSauce(pizza);
		return pizza;
	}
	public Pizza getCheese(Pizza pizza)
	{
		pizza = new ReggianoCheese(pizza);
		return pizza;
	}
	public Pizza getVeggies(Pizza pizza)
	{
		pizza = new Garlic(pizza);
		pizza = new Onion(pizza);
		pizza = new Mushroom(pizza);
		pizza = new RedPepper(pizza);
		return pizza;
	}
	public Pizza getPepperoni(Pizza pizza)
	{
		pizza = new SlicedPepperoni(pizza);
		return pizza;
	}
	public Pizza getClam(Pizza pizza)
	{
		pizza = new FreshClams(pizza);
		return pizza;
	}
}
