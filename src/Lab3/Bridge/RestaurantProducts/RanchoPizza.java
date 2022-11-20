package Lab3.Bridge.RestaurantProducts;

public class RanchoPizza extends Pizza{

    @Override
    public void assemble() {
        System.out.println("Adding " + sauce + " sauce.");
        System.out.println("Adding chicken breast.");
        System.out.println("Adding cheese and " + toppings +".");
        System.out.println("Crust type " + crust);
    }
}
