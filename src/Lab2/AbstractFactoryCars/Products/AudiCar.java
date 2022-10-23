package Lab2.AbstractFactoryCars.Products;

public class AudiCar implements Car {
    @Override
    public void create() {
        System.out.println("Audi Car was created!");
    }
}
