package Lab2;

import Lab2.CarsBuilder.Vehicle;
import Lab2.CarsBuilder.VehicleBuilder;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //creating some cars using builder design pattern
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        VehicleBuilder builder = new VehicleBuilder();
        List<Vehicle> cars = new ArrayList<>();

        builder.brand("Bugatti")
                .surnameBrand("Chiron")
                .type("Hyper Car")
                .engine("6.5l")
                .color("black")
                .horsePower(1500)
                .maxSpeed(400)
                .createdAt("12 September 2020");
        Vehicle bugatti = builder.build();

        builder.brand("Lamborghini")
                .surnameBrand("Aventador")
                .type("Super Car")
                .engine("8l")
                .color("green")
                .horsePower(960)
                .maxSpeed(320)
                .createdAt("12 October 2018");
        Vehicle lambo = builder.build();

        builder.brand("Porsche")
                .surnameBrand("Cayman")
                .type("Sport Car")
                .engine("4l")
                .color("white")
                .horsePower(660)
                .maxSpeed(270)
                .createdAt("15 December 2017");
        Vehicle porsche = builder.build();

        builder.brand("Ford")
                .surnameBrand("Mustang")
                .type("Sport Car")
                .engine("5l")
                .color("blue")
                .horsePower(720)
                .maxSpeed(300)
                .createdAt("17 July 2021");
        Vehicle ford = builder.build();

        builder.brand("Audi")
                .surnameBrand("R8")
                .type("Sport Car")
                .engine("5.2l")
                .color("red")
                .horsePower(802)
                .maxSpeed(300)
                .createdAt("20 November 2019");
        Vehicle audi= builder.build();

        cars.add(bugatti);
        cars.add(lambo);
        cars.add(porsche);
        cars.add(ford);
        cars.add(audi);
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // Prototype
        List<Vehicle> copyList = new ArrayList<>();
        for (Vehicle vehicle : cars) {
            copyList.add(vehicle.clone());
        }
        copyList.add(porsche.clone());
        copyList.forEach(System.out::println);


    }
    
}
