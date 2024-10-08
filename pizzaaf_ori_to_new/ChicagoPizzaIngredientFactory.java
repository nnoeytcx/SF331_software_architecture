
public class ChicagoPizzaIngredientFactory extends PizzaIngredientFactory 
{

	public Pizza getDough(){
		Pizza pizza = new ThickcrustPizza();
		return pizza;
	}

	public Pizza getSauce(Pizza pizza)
	{
		pizza = new PlumTomatoSauce(pizza);
		return pizza;
	}
	public Pizza getCheese(Pizza pizza)
	{
		pizza = new MozzarellaCheese(pizza);
		return pizza;
	}
	public Pizza getVeggies(Pizza pizza)
	{
		pizza = new BlackOlives(pizza);
		pizza = new Spinach(pizza);
		pizza = new Eggplant(pizza);
		return pizza;
	}
	public Pizza getPepperoni(Pizza pizza)
	{
		pizza = new SlicedPepperoni(pizza);
		return pizza;
	}
	public Pizza getClam(Pizza pizza)
	{
		pizza = new FrozenClams(pizza);
		return pizza;
	}
}
