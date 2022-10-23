package Lab2;

import Lab2.CarsBuilder.Vehicle;
import Lab2.CarsBuilder.VehicleBuilder;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        VehicleBuilder builder = new VehicleBuilder();
        Set<Vehicle> cars = new HashSet<>();

        builder.brand("Bugatti")
                .surnameBrand("Chiron")
        .type("Hyper Car")
        .color("black")
        .horsePower(1500)
        .maxSpeed(400)
        .createdAt("12 September 2020");

        Vehicle bugatti = builder.build();
        cars.add(bugatti);

        builder.brand("Lamborghini")
                .surnameBrand("Aventador")
                .type("Hyper Car")
                .color("green")
                .horsePower(960)
                .maxSpeed(320)
                .createdAt("12 October 2018");

        Vehicle lambo = builder.build();
        cars.add(lambo);

        for (Vehicle car : cars) {
            System.out.println(car.toString());
        }

    }
    
}
