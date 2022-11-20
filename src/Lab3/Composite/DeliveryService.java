package Lab3.Composite;

public class DeliveryService {
    private Order order;

    public DeliveryService(){

    }

    public void setupOrder(Order... products){
        this.order = new CompositeOrder(products);
    }

    public double calculateOrderPrice(){
        return order.calculatePrice();
    }
}
