package Lab2.AbstractFactoryCars.Products;

public class PorscheEngine implements Engine{
    @Override
    public void create() {
        System.out.println("Porsche Engine was created!");
    }
}
