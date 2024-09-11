// id : 6510742056
// name : thitichaya pounglaowech
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

class PizzaStore
{
	public static void main(String args[])
	{
		Pizza pizza = new PizzaDough();
        pizza = new Pineapple(pizza);
        pizza = new Cheese(pizza);
        pizza = new Ham(pizza);
        pizza = new Tomato(pizza);
        System.out.println("Hawaiian Pizza : ");
        System.out.println(pizza.getDescription() +
                         " Cost : " + pizza.cost());
                         
		Pizza pizza2 = new PizzaDough();
        pizza2 = new Cheese(pizza2);
        pizza2 = new Pepper(pizza2);
        pizza2 = new Shrimp(pizza2);
        pizza2 = new Mussels(pizza2);
        pizza2 = new Tomato(pizza2);
        System.out.println("Seafood Pizza : ");
        System.out.println(pizza2.getDescription() +
                         " Cost : " + pizza2.cost());
    }
}