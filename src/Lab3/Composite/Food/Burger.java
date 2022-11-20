package Lab3.Composite.Food;

public class Burger extends Food{

    public Burger(String foodName, double price) {
        super(foodName, price);
    }

    @Override
    public double calculatePrice() {
        return getPrice();
    }
}
