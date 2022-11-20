package Lab3.Facade.FoodApp;

public class ItalianRestaurantService extends  RestaurantService{

    @Override
    public void buyFood(User user, int orderPrice) {
        System.out.println("Buying italian food at the price of " + orderPrice);
    }
}
