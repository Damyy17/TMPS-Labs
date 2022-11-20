package Lab3.Bridge.Restaurants;

import Lab3.Bridge.RestaurantProducts.Pizza;

public abstract class  Restaurant {

    protected Pizza pizza;

    protected Restaurant(Pizza pizza) {
        this.pizza = pizza;
    }

    abstract void addSauce();
    abstract void addToppings();
    abstract void makeCrust();

    public void deliver() {
        addSauce();
        addToppings();
        makeCrust();
        pizza.assemble();
        System.out.println("Order in Progress!");
    }
}
