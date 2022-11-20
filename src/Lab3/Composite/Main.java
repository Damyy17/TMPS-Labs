package Lab3.Composite;

import Lab3.Composite.Food.Burger;
import Lab3.Composite.Food.Pizza;
import Lab3.Composite.Food.Salad;

public class Main {
    public static void main(String[] args) {
        DeliveryService deliveryService = new DeliveryService();
        deliveryService.setupOrder(
                new CompositeOrder(
                        new Burger("Chicken Burger", 40),
                        new Burger("Beef Burger", 45),
                        new Burger("Veggie Burger", 30)
                ),
                new Pizza("Rancho Pizza", 100),
                new Salad("Caesar Salad", 55)
        );
        System.out.println("Total price for order: " + deliveryService.calculateOrderPrice());
    }
}
