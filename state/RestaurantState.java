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

abstract class State {
    public void orderFoodDrink(String order) {

    }
    public void getProduct() {

    }
    public void serveProduct() {

    }
}

class Wait extends State {
    RestaurantState restaurantstate;

    public Wait(RestaurantState restaurantstate)
    {
        this.restaurantstate = restaurantstate;
    }
    public void orderFoodDrink(String order) {
        System.out.println("You have ordered : " + order);
        restaurantstate.order = order;
        restaurantstate.setState(restaurantstate.getProduceProductState());
        restaurantstate.getProduct();
    }
    public void getProduct() {
        System.out.println("Sorry we are not received any order yet");
    }
    public void serveProduct() {
        System.out.println("Sorry we are not received any order yet");
    }
    public String toString() {
        return "Waiting to get the order";
    }
}
class ProduceProduct extends State {
    RestaurantState restaurantstate;

    public ProduceProduct(RestaurantState restaurantstate)
    {
        this.restaurantstate = restaurantstate;
    }
    public void orderFoodDrink(String order) {
        System.out.println("Sorry we are just making the order");
    }
    public void getProduct() {
        if (restaurantstate.order.equals("Latte"))
        {
            System.out.println("We are making your order : " + restaurantstate.order);
            latteFactory lattemaker = new latteFactory();
            Coffee coffee = lattemaker.make();
            restaurantstate.coffee = coffee;
            restaurantstate.setState(restaurantstate.getServeState());
            restaurantstate.serveProduct();
        }
        else if (restaurantstate.order.equals("Americano"))
        {
            System.out.println("We are making your order : " + restaurantstate.order);
            americanoFactory americanomaker = new americanoFactory();
            Coffee coffee = americanomaker.make();
            restaurantstate.coffee = coffee;
            restaurantstate.setState(restaurantstate.getServeState());
            restaurantstate.serveProduct();
        }
        else if (restaurantstate.order.equals("HawaiianPizza"))
        {
            System.out.println("We are making your order : " + restaurantstate.order);
            hawaiFactory hawaiimaker = new hawaiFactory();
            Pizza pizza = hawaiimaker.make();
            restaurantstate.pizza = pizza;
            restaurantstate.setState(restaurantstate.getServeState());
            restaurantstate.serveProduct();
        }
        else if (restaurantstate.order.equals("SeafoodPizza"))
        {
            System.out.println("We are making your order : " + restaurantstate.order);
            seafoodFactory seafoodmaker = new seafoodFactory();
            Pizza pizza = seafoodmaker.make();
            restaurantstate.pizza = pizza;
            restaurantstate.setState(restaurantstate.getServeState());
            restaurantstate.serveProduct();
        }
        else
        {
            System.out.println("Sorry we don't have " + restaurantstate.order);
            restaurantstate.setState(restaurantstate.getWaitState());
        }
    }
    public void serveProduct() {
        System.out.println("Sorry we are just making the order");
    }
    public String toString() {
        return "Producing the order";
    }
}
class Serve extends State {
    RestaurantState restaurantstate;

    public Serve(RestaurantState restaurantstate)
    {
        this.restaurantstate = restaurantstate;
    }
    public void orderFoodDrink(String order) {
        System.out.println("Sorry we are serving the order");
    }
    public void getProduct() {
        System.out.println("Sorry we are serving the order");
    }
    public void serveProduct() {
        if (restaurantstate.order.equals("Latte") || restaurantstate.order.equals("Americano"))
        {
            System.out.println("We are serving your order : " + restaurantstate.order);
            System.out.println(restaurantstate.order + " : [ " + restaurantstate.coffee.getDescription() +
                    "] Cost : " + restaurantstate.coffee.cost());
            restaurantstate.setState(restaurantstate.getWaitState());
        }
        else if (restaurantstate.order.equals("HawaiianPizza") || restaurantstate.order.equals("SeafoodPizza"))
        {
            System.out.println("We are serving your order : " + restaurantstate.order);
            System.out.println(restaurantstate.order + " : [ " + restaurantstate.pizza.getDescription() +
                    "] Cost : " + restaurantstate.pizza.cost());
            restaurantstate.setState(restaurantstate.getWaitState());
        }
    }
    public String toString() {
        return "Serving the order";
    }
}
class RestaurantState
{
    State wait;
    State produceProduct;
    State serve;

    State state;

    String order;
    Coffee coffee;
    Pizza pizza;

    public RestaurantState(){
        wait = new Wait(this);
        produceProduct = new ProduceProduct(this);
        serve = new Serve(this);

        state = wait;
    }

    public void orderFoodDrink(String order) {
        state.orderFoodDrink(order);
    }

    public void getProduct() {
        state.getProduct();
    }

    public void serveProduct() {
        state.serveProduct();
    }

    void setState(State state)
    {
        this.state = state;
    }

    public State getState()
    {
        return state;
    }

    public State getWaitState() {
        return wait;
    }

    public State getProduceProductState() {
        return produceProduct;
    }

    public State getServeState() {
        return serve;
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\n");
        result.append("restaurant is in state : "+ state + "\n");
        return result.toString();
    }

    public static void main(String args[])
	{   
        RestaurantState restaurant = new RestaurantState();

        // System.out.println(restaurant);
        restaurant.orderFoodDrink("Latte");
        // System.out.println(restaurant);
        // restaurant.getProduct();
        // System.out.println(restaurant);
        // restaurant.serveProduct();
        // System.out.println(restaurant);

        restaurant.orderFoodDrink("Americano");
        // System.out.println(restaurant);
        // restaurant.getProduct();
        // System.out.println(restaurant);
        // restaurant.serveProduct();
        // System.out.println(restaurant);
        restaurant.orderFoodDrink("SeafoodPizza");
        restaurant.orderFoodDrink("HawaiianPizza");
        restaurant.orderFoodDrink("SomePizza");
        // restaurant.getProduct();
        // restaurant.serveProduct();
        System.out.println(restaurant);


	}
}