package Lab3.Facade.FoodApp;

public class RestaurantType {

    public static RestaurantService getRestaurantService(String type){
        if (type.equals("american")){
            return new AmericanRestaurantService();
        } else if (type.equals("italian"))
            return new ItalianRestaurantService();
        else return new RestaurantService() {
                @Override
                public void buyFood(User user, int orderPrice) {
                    System.out.println("Buying " + orderPrice + " of some other restaurant service food.." );
                }
            };
    }
}
