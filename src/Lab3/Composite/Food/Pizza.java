package Lab3.Composite.Food;

public class Pizza extends Food{

    public Pizza(String foodName, double price) {
        super(foodName, price);
    }

    @Override
    public double calculatePrice() {
        return  getPrice();
    }
}
