package Lab3.Bridge.RestaurantProducts;

public class PepperoniPizza extends Pizza{

    @Override
    public void assemble() {
        System.out.println("Adding " + sauce + " sauce.");
        System.out.println("Adding pepperoni.");
        System.out.println("Adding cheese and " + toppings +".");
        System.out.println("Crust type " + crust);
    }

}
