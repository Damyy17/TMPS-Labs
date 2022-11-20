package Lab3.Composite.Food;

import Lab3.Composite.Order;

public abstract class Food implements Order {

    protected final String foodName;
    protected final double price;

    protected Food(String foodName, double price) {
        this.foodName = foodName;
        this.price = price;
    }

    public String getFoodName() {
        return foodName;
    }

    public double getPrice() {
        return price;
    }
}
