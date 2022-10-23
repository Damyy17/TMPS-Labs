package Lab2.CarsFactory;

public class SportCar implements CarFactory{
    @Override
    public void create() {
        System.out.println("Creating new Sport Car...");
    }
}
