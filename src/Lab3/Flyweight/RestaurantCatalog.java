package Lab3.Flyweight;

import java.util.ArrayList;
import java.util.List;

public class RestaurantCatalog {
    private final List<Restaurant> restaurants = new ArrayList<>();

    public void saveRestaurant(String name, String location, String type, List<String> foodTypes, String otherData){
        RestaurantType restaurantType = RestaurantFactory.getRestaurantType(type, foodTypes, otherData);
        restaurants.add(new Restaurant(name, location, restaurantType));
    }

    public void displayRestaurants(){
        restaurants.forEach(System.out::println);
    }
}
