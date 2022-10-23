package Lab2.AbstractFactoryCars.Products;

public class AudiEngine implements Engine{
    @Override
    public void create() {
        System.out.println("Audi Engine was created!");
    }
}
