package Lab3.Bridge;

import Lab3.Bridge.RestaurantProducts.PepperoniPizza;
import Lab3.Bridge.RestaurantProducts.RanchoPizza;
import Lab3.Bridge.Restaurants.AmericanRestaurant;
import Lab3.Bridge.Restaurants.ItalianRestaurant;
import Lab3.Bridge.Restaurants.Restaurant;

public class Main {
    public static void main(String[] args) {
        Restaurant americanRestaurant = new AmericanRestaurant(new PepperoniPizza());
        americanRestaurant.deliver();

        System.out.println();

        Restaurant italianRestaurant = new ItalianRestaurant(new RanchoPizza());
        italianRestaurant.deliver();
    }
}
