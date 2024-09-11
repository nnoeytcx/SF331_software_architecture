// id : 6510742056
// name : thitichaya pounglaowech

abstract class Coffee
{
	String description = "Unknown drink";

	public String getDescription()
	{
		return description;
	}

	public abstract int cost();
}

abstract class CoffeeTopping extends Coffee
{
	public abstract String getDescription();
}

class EspressoShot extends Coffee
{
	public EspressoShot() { description = "EspressoShot"; }
	public int cost() { return 10; }
}

class Milk extends CoffeeTopping {
    Coffee coffee;

    public Milk(Coffee coffee) {
        this.coffee = coffee;
    }
    public String getDescription() {
        return coffee.getDescription() + ", Milk ";
    }
    public int cost() {
        return 5 + coffee.cost();
    }
}

class HotWaver extends CoffeeTopping {
    Coffee coffee;

    public HotWaver(Coffee coffee) {
        this.coffee = coffee;
    }
    public String getDescription() {
        return coffee.getDescription() + ", Hot waver ";
    }
    public int cost() {
        return 3 + coffee.cost();
    }
}

abstract class Pizza
{
	String description = "Unknown Pizza";

	public String getDescription()
	{
		return description;
	}

	public abstract int cost();
}

abstract class Topping extends Pizza
{
	public abstract String getDescription();
}

class PizzaDough extends Pizza
{
	public PizzaDough() { description = "PizzaDough"; }
	public int cost() { return 20; }
}

class Pineapple extends Topping {
    Pizza pizza;

    public Pineapple(Pizza pizza) {
        this.pizza = pizza;
    }
    public String getDescription() {
        return pizza.getDescription() + ", Pineapple ";
    }
    public int cost() {
        return 5 + pizza.cost();
    }
}

class Cheese extends Topping {
    Pizza pizza;

    public Cheese(Pizza pizza) {
        this.pizza = pizza;
    }
    public String getDescription() {
        return pizza.getDescription() + ", Cheese ";
    }
    public int cost() {
        return 8 + pizza.cost();
    }
}

class Ham extends Topping {
    Pizza pizza;

    public Ham(Pizza pizza) {
        this.pizza = pizza;
    }
    public String getDescription() {
        return pizza.getDescription() + ", Ham ";
    }
    public int cost() {
        return 15 + pizza.cost();
    }
}

class Pepper extends Topping {
    Pizza pizza;

    public Pepper(Pizza pizza) {
        this.pizza = pizza;
    }
    public String getDescription() {
        return pizza.getDescription() + ", Pepper ";
    }
    public int cost() {
        return 9 + pizza.cost();
    }
}

class Shrimp extends Topping {
    Pizza pizza;

    public Shrimp(Pizza pizza) {
        this.pizza = pizza;
    }
    public String getDescription() {
        return pizza.getDescription() + ", Shrimp ";
    }
    public int cost() {
        return 7 + pizza.cost();
    }
}

class Mussels extends Topping {
    Pizza pizza;

    public Mussels(Pizza pizza) {
        this.pizza = pizza;
    }
    public String getDescription() {
        return pizza.getDescription() + ", Mussels ";
    }
    public int cost() {
        return 4 + pizza.cost();
    }
}

class Tomato extends Topping {
    Pizza pizza;

    public Tomato(Pizza pizza) {
        this.pizza = pizza;
    }
    public String getDescription() {
        return pizza.getDescription() + ", Tomato ";
    }
    public int cost() {
        return 3 + pizza.cost();
    }
}

abstract class PizzaFactory {
    public abstract Pizza make();
}

abstract class CoffeeFactory {
    public abstract Coffee make();
}
class hawaiFactory extends PizzaFactory
{
    public hawaiFactory()
    {
        
    }
    public Pizza make()
    {
        Pizza pizza = new PizzaDough();
        pizza = new Pineapple(pizza);
        pizza = new Cheese(pizza);
        pizza = new Ham(pizza);
        pizza = new Tomato(pizza);
        System.out.println("Hawaiian Pizza is made!");
        return pizza;
    }
}

class seafoodFactory extends PizzaFactory
{
    public seafoodFactory()
    {
        
    }
    public Pizza make()
    {
        Pizza pizza = new PizzaDough();
        pizza = new Cheese(pizza);
        pizza = new Pepper(pizza);
        pizza = new Shrimp(pizza);
        pizza = new Mussels(pizza);
        pizza = new Tomato(pizza);
        System.out.println("Seafood Pizza is made!");
        return pizza;
    }
}
class latteFactory extends CoffeeFactory
{
    public latteFactory(){

    }
    public Coffee make()
    {
        Coffee coffee = new EspressoShot();
        coffee = new Milk(coffee);
        System.out.println("Latte is made!");
        return coffee;
    }
}

class americanoFactory extends CoffeeFactory
{
    public americanoFactory(){
        
    }
    public Coffee make()
    {
        Coffee coffee = new EspressoShot();
        coffee = new HotWaver(coffee);
        System.out.println("Americano is made!");
        return coffee;
    }
}
class Factory
{
    public static void main(String args[])
	{
        hawaiFactory hawaimaker = new hawaiFactory();
        seafoodFactory seafoodmaker = new seafoodFactory();
        Pizza pizza1 = hawaimaker.make();
        System.out.println(pizza1.getDescription() +
                         " Cost : " + pizza1.cost());
        Pizza pizza2 = seafoodmaker.make();
        System.out.println(pizza2.getDescription() +
                         " Cost : " + pizza2.cost());

        latteFactory lattemaker = new latteFactory();
        americanoFactory americanomaker = new americanoFactory();
        Coffee coffee1 = lattemaker.make();
        System.out.println(coffee1.getDescription() +
                         " Cost : " + coffee1.cost());
        Coffee coffee2 = americanomaker.make();
        System.out.println(coffee2.getDescription() +
                         " Cost : " + coffee2.cost());
	}
}