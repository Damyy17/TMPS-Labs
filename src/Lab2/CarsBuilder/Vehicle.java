package Lab2.CarsBuilder;

public class Vehicle {
    private final String brand;
    private final String surnameBrand;
    private final String type;
    private final String color;
    private int horsePower;
    private int maxSpeed;
    private final String createdAt;

    Vehicle(String brand, String surnameBrand, String type, String color, int horsePower, int maxSpeed, String createdAt){
        this.brand = brand;
        this.surnameBrand = surnameBrand;
        this.type = type;
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
                ", color='" + color + '\'' +
                ", horsePower=" + horsePower +
                ", maxSpeed=" + maxSpeed +
                ", createdAt='" + createdAt + '\'' +
                '}';
    }
}
