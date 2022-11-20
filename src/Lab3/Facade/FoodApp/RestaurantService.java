package Lab3.Facade.FoodApp;

public abstract class RestaurantService {

    private DatabaseService databaseService;

    public abstract void buyFood(User user, int orderPrice);

}
