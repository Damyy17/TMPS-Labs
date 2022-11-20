package Lab3.Facade;

public class Main {
    public static void main(String[] args) {
        BuyFoodFacade buyFoodFacade = new BuyFoodFacade();
        buyFoodFacade.buyFood(400, "american");
    }
}
