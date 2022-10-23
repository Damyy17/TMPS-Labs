package Lab2.CarsBuilder;

public class VehicleBuilder implements Builder{
    private String brand;
    private String surnameBrand;
    private String type;
    private String engine;
    private String color;
    private int horsePower;
    private int maxSpeed;
    private String createdAt;

    public VehicleBuilder brand(String brand){
        this.brand = brand;
        return this;
    }

    public VehicleBuilder surnameBrand(String surnameBrand){
        this.surnameBrand = surnameBrand;
        return this;
    }

    public VehicleBuilder type(String type){
        this.type = type;
        return this;
    }

    public VehicleBuilder engine(String engine){
        this.engine = engine;
        return this;
    }

    public VehicleBuilder color(String color){
        this.color = color;
        return this;
    } 

    public VehicleBuilder horsePower(int horsePower){
        this.horsePower = horsePower;
        return this;
    }

    public VehicleBuilder maxSpeed(int maxSpeed){
        this.maxSpeed = maxSpeed;
        return this;
    }

    public VehicleBuilder createdAt(String createdAt){
        this.createdAt = createdAt;
        return this;
    }

    public Vehicle build() {
        return new Vehicle(brand, surnameBrand, type, engine, color, horsePower, maxSpeed, createdAt);
    }

    
}