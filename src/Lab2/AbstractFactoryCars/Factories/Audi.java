package Lab2.AbstractFactoryCars.Factories;

import Lab2.AbstractFactoryCars.Products.AudiCar;
import Lab2.AbstractFactoryCars.Products.AudiEngine;
import Lab2.AbstractFactoryCars.Products.Car;
import Lab2.AbstractFactoryCars.Products.Engine;

public class Audi extends Company{
    @Override
    public Engine createEngine() {
        return new AudiEngine();
    }

    @Override
    public Car createCar() {
        return new AudiCar();
    }
}
