package Lab2.AbstractFactoryCars.Products;

public class PorscheCar implements Car{

    @Override
    public void create() {
        System.out.println("Porsche Car was created!");
    }
}
