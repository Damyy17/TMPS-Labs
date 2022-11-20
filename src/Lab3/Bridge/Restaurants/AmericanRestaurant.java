package Lab3.Bridge.Restaurants;

import Lab3.Bridge.RestaurantProducts.Pizza;

public class AmericanRestaurant extends Restaurant{

    public AmericanRestaurant(Pizza pizza){
        super(pizza);
    }

    @Override
    void addSauce() {
        pizza.setSauce("Tomato");
    }

    @Override
    void addToppings() {
        pizza.setToppings("mushrooms, pepper, extra cheese, bacon, black olives");
    }

    @Override
    void makeCrust() {
        pizza.setCrust("Thick");
    }
}
