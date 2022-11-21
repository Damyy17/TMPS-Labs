package Lab3.Flyweight;

import java.util.List;
import java.util.Random;

public class Main {
    private static final int RESTAURANT_TYPES = 2;
    private static final int RESTAURANTS_TO_ADD = 250;

    public static void main(String[] args) {
        RestaurantCatalog restaurantCatalog = new RestaurantCatalog();
        for (int i = 0; i < RESTAURANTS_TO_ADD / RESTAURANT_TYPES; i++) {
            restaurantCatalog.saveRestaurant(getRandomName(), getRandomLocation(), "AmericanFood", List.of("Burger", "Pizza", "Coke Cola", "Nuggets", "Fries"), "Good Rating");
            restaurantCatalog.saveRestaurant(getRandomName(), getRandomLocation(), "ItalianFood", List.of("Pizza", "Pasta", "Lasagna", "Cocktails"), "The Best");
        }

        System.out.println("Number of restaurants in the app catalog " + RESTAURANTS_TO_ADD);
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.println("Memory Usage: (we are assuming that each field consumes 10 bytes)");
        System.out.println("Restaurant size (20 bytes) * " + RESTAURANTS_TO_ADD + " + RestaurantType Size (30 bytes) * "+ RESTAURANT_TYPES+"");
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println("Total: " + ((RESTAURANTS_TO_ADD * 20 + RESTAURANT_TYPES * 30 )/1024) + "KB instead of " + ((RESTAURANTS_TO_ADD * 50) / 1024) + "KB");
    }

    private static String getRandomName(){
        List<String> restaurants = List.of("Andy's pizza", "Pizza Mania", "McDonald's", "KFC", "Wasabi", "Restaurant Unknown", "Domino's Pizza", "Torro Burger");
        return restaurants.get(new Random().nextInt(restaurants.size()));
    }

    private static String getRandomLocation(){
        List<String> locations = List.of("str. 31 August", "str. Studentilor", "str. Bucuresti", "str. VasileAlecsandri", "str. idk", "str. ???");
        return locations.get(new Random().nextInt(locations.size()));
    }
}
