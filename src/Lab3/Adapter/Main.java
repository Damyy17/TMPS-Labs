package Lab3.Adapter;

public class Main {
    public static void main(String[] args) {
        Price pizza = new Pizza();
        PriceAdapter pizzaPriceInDollars = new PriceAdapterImpl(pizza);

        System.out.println("Pizza price in euro: " + pizza.getPrice() + "€");
        System.out.println("Pizza price in dollars is: " + pizzaPriceInDollars.getPrice() +"$");;

    }
}
