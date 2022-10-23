package Lab2.ProjectCars;

public class Vehicle {
    private final String brand;
    private final String type;
    private final String color;
    private int horsePower;
    private int maxSpeed;
    private final String createdAt;

    Vehicle(String brand, String type, String color, int horsePower, int maxSpeed, String createdAt){
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.horsePower = horsePower;
        this.maxSpeed = maxSpeed;
        this.createdAt = createdAt;
    }


    public String getBrand() {
        return this.brand;
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
        return "{" +
            " brand='" + getBrand() + "'" +
            ", type='" + getType() + "'" +
            ", color='" + getColor() + "'" +
            ", horsePower='" + getHorsePower() + "'" +
            ", maxSpeed='" + getMaxSpeed() + "'" +
            ", createdAt='" + getCreatedAt() + "'" +
            "}";
    }

}
