package Lab3.Flyweight;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RestaurantFactory {

    private static final Map<String, RestaurantType> restaurantTypes = new HashMap<>();

    public static RestaurantType getRestaurantType(String type, List<String> foodTypes, String otherData){
        if (restaurantTypes.get(type) == null){
            restaurantTypes.put(type, new RestaurantType(type, foodTypes, otherData));
        }
        return restaurantTypes.get(type);
    }
}
