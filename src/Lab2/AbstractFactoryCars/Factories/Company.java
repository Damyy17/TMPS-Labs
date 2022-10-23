package Lab2.AbstractFactoryCars.Factories;

import Lab2.AbstractFactoryCars.Products.Car;
import Lab2.AbstractFactoryCars.Products.Engine;

public abstract class Company {
    public abstract Engine createEngine();
    public abstract Car createCar();
}
