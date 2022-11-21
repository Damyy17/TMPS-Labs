package Lab3.Flyweight;

import java.util.List;

public class RestaurantType {
    private final String type;
    private final List<String> foodType;
    private final String otherData;

    public RestaurantType(String type, List<String> foodType, String otherData) {
        this.type = type;
        this.foodType = foodType;
        this.otherData = otherData;
    }

    public String getType() {
        return type;
    }

    public List<String> getFoodType() {
        return foodType;
    }

    public String getOtherData() {
        return otherData;
    }

    @Override
    public String toString() {
        return "RestaurantType{" +
                "type='" + type + '\'' +
                ", foodType=" + foodType +
                ", otherData='" + otherData + '\'' +
                '}';
    }
}
