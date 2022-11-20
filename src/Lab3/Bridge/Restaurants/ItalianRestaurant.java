package Lab3.Bridge.Restaurants;

import Lab3.Bridge.RestaurantProducts.Pizza;

public class ItalianRestaurant extends Restaurant{

    public ItalianRestaurant(Pizza pizza) {
        super(pizza);
    }

    @Override
    void addSauce() {
        pizza.setSauce("Secret white sauce");
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
