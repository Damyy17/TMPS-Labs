package Lab3.Facade;

import Lab3.Facade.FoodApp.DatabaseService;
import Lab3.Facade.FoodApp.RestaurantType;
import Lab3.Facade.FoodApp.UIService;
import Lab3.Facade.FoodApp.User;

public class BuyFoodFacade {
    public void buyFood(int orderPrice, String type){
        DatabaseService databaseService = new DatabaseService();
        User user = databaseService.getUser(UIService.getLoggedInUserId());
        if (user.getBalance() < orderPrice){
            System.out.println("Insufficient balance to perform the shopping");
        }
        RestaurantType.getRestaurantService(type).buyFood(user, orderPrice);
        System.out.println( "The order of " + type + " food of price: " + orderPrice+ ", was successfully made, price" );
    }
}
