package Lab2.ProjectCars;

public class Main {

    public static void main(String[] args) {

        VehicleBuilder builder = new VehicleBuilder();

        builder.brand("Bugatti")
        .type("Hyper Car")
        .color("black")
        .horsePower(1500)
        .maxSpeed(400)
        .createdAt("12 September 2020");

        Vehicle bugatti = builder.build();
        System.out.println(bugatti.toString());
    }
    
}
