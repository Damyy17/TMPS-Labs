package Lab3.Composite.Food;

public class Salad extends Food{

    public Salad(String foodName, double price) {
        super(foodName, price);
    }

    @Override
    public double calculatePrice() {
        return getPrice();
    }
}
