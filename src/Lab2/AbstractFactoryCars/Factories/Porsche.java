package Lab2.AbstractFactoryCars.Factories;

import Lab2.AbstractFactoryCars.Products.*;

public class Porsche extends Company{
    @Override
    public Engine createEngine() {
        return new PorscheEngine();
    }

    @Override
    public Car createCar() {
        return new PorscheCar();
    }
}
