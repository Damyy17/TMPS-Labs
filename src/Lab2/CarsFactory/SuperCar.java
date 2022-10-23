package Lab2.CarsFactory;

public class SuperCar implements CarFactory{
    @Override
    public void create() {
        System.out.println("Creating new Super Car...");
    }
}
