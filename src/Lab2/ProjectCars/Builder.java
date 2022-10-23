package Lab2.ProjectCars;

public interface Builder {

    Builder brand(String Brand);

    Builder type(String Type);

    Builder color(String color);
    
    Builder horsePower(int horsePower);
    
    Builder maxSpeed(int maxSpeed);
    
    Builder createdAt(String createdAt);
    
}
