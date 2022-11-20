package Lab3.Composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompositeOrder implements Order {

    private final List<Order> foods = new ArrayList<>();

    public CompositeOrder(Order... products){
        foods.addAll(Arrays.asList(products));
    }

    @Override
    public double calculatePrice() {
        return foods.stream().mapToDouble(Order::calculatePrice).sum();
    }
}
