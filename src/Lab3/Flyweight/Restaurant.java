package Lab3.Flyweight;

public class Restaurant {

    private final String name;
    private final String location;
    private final RestaurantType type;

    public Restaurant(String name, String location, RestaurantType type) {
        this.name = name;
        this.location = location;
        this.type = type;
    }
}
