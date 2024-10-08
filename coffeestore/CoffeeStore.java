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

abstract class Topping extends Coffee
{
	public abstract String getDescription();
}

class EspressoShot extends Coffee
{
	public EspressoShot() { description = "EspressoShot"; }
	public int cost() { return 10; }
}

class Milk extends Topping {
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

class HotWaver extends Topping {
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

class CoffeeStore
{
	public static void main(String args[])
	{
		Coffee coffee = new EspressoShot();
        coffee = new HotWaver(coffee);
        System.out.println("Americano : ");
        System.out.println(coffee.getDescription() +
                         " Cost : " + coffee.cost());
        
        Coffee coffee2 = new EspressoShot();
        coffee2 = new Milk(coffee2);
        System.out.println("Caffe Latte : ");
        System.out.println(coffee2.getDescription() +
                         " Cost : " + coffee2.cost());
        
	}
}