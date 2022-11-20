package Lab3.Facade.FoodApp;

public class AmericanRestaurantService extends RestaurantService{

    @Override
    public void buyFood(User user, int orderPrice) {
        System.out.println("Buying american food at the price of " + orderPrice);
    }
}
