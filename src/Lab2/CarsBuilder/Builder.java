package Lab2.CarsBuilder;

public interface Builder {

    Builder brand(String Brand);

    Builder surnameBrand(String surnameBrand);

    Builder type(String Type);

    Builder color(String color);
    
    Builder horsePower(int horsePower);
    
    Builder maxSpeed(int maxSpeed);
    
    Builder createdAt(String createdAt);
    
}
