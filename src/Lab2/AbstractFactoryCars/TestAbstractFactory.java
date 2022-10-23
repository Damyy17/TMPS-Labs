package Lab2.AbstractFactoryCars;

import Lab2.AbstractFactoryCars.Factories.Audi;
import Lab2.AbstractFactoryCars.Factories.Company;
import Lab2.AbstractFactoryCars.Factories.Porsche;
import Lab2.AbstractFactoryCars.Products.ProductType;

import java.util.List;

public class TestAbstractFactory {
    public static void main(String[] args) {
        Company audi = new Audi();
        Company porsche = new Porsche();

        List.of(audi.createEngine(), porsche.createEngine())
                .forEach(ProductType::create);

        System.out.println();
        porsche.createCar().create();
    }
}
