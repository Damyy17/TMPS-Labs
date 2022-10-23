package Lab2.CarsFactory;

public class Dealership {

    public CarFactory orderCar(String request){
        CarFactory carFactory = null;
        if ("Super Car".equals(request)){
            carFactory = new SuperCar();
        } else if ("Sport Car".equals(request)){
            carFactory = new SportCar();
        }
        assert carFactory != null;
        carFactory.create();
        return carFactory;
    }
}
