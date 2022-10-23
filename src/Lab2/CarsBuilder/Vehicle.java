package Lab2.CarsBuilder;

import Lab2.CarsPrototype.Prototype;

public class Vehicle implements Prototype {
    private final String brand;
    private final String surnameBrand;
    private final String type;

    private final String engine;
    private final String color;
    private int horsePower;
    private int maxSpeed;
    private final String createdAt;

    Vehicle(String brand, String surnameBrand, String type, String engine, String color, int horsePower, int maxSpeed, String createdAt){
        this.brand = brand;
        this.surnameBrand = surnameBrand;
        this.type = type;
        this.engine = engine;
        this.color = color;
        this.horsePower = horsePower;
        this.maxSpeed = maxSpeed;
        this.createdAt = createdAt;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getSurnameBrand() {
        return this.surnameBrand;
    }

    public String getType() {
        return this.type;
    }

    public String getEngine() {
        return this.engine;
    }

    public String getColor() {
        return this.color;
    }

    public int getHorsePower() {
        return this.horsePower;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public String getCreatedAt() {
        return this.createdAt;
    }

    @Override
    public String toString() {
        return brand + " " + surnameBrand + " specifications are " +
                "type='" + type + '\'' +
                ",engine='" + engine + '\'' +
                ", color='" + color + '\'' +
                ", horsePower=" + horsePower +
                ", maxSpeed=" + maxSpeed +
                ", createdAt='" + createdAt + '\'' +
                '}';
    }

    public Vehicle(Vehicle vehicle){
        this.brand =  vehicle.brand;
        this.surnameBrand =  vehicle.surnameBrand;
        this.type =  vehicle.type;
        this.engine =  vehicle.engine;
        this.color =  vehicle.color;
        this.horsePower =  vehicle.horsePower;
        this.maxSpeed =  vehicle.maxSpeed;
        this.createdAt =  vehicle.createdAt;
    }

    //Prototype design principle
    @Override
    public Vehicle clone() {
        return new Vehicle(this);
    }
}
