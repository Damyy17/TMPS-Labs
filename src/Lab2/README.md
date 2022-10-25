# Laboratory work nr 2, TMPS
## Creational Design Patterns

---

## Theory
In software engineering, creational design patterns are design patterns that deal with object creation mechanisms, 
trying to create objects in a manner suitable to the situation. The basic form of object creation could result in design 
problems or added complexity to the design. Creational design patterns solve this problem by somehow controlling this 
object creation.

## Implementation description
### Singleton Design Pattern
* Ensure a class has only one instance, and provide a global point of access to it.
* Encapsulated "just-in-time initialization" or "initialization on first use".

Implementation of the singleton design pattern is below:
```
public class Singleton {

    private static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    public void doSmth(){
        
    }
}
```
The Singleton pattern ensures that a class has only one instance and provides a global point of access to that instance.
So here in the code you can see that we have that instance which is created if it doesn't exist, or it returns tha existent
instance.

### Builder Design Pattern
* Separate the construction of a complex object from its representation so that the same construction process can create 
different representations.
* Parse a complex representation, create one of several targets.
  Implementation of the builder design pattern is below:
```
public class VehicleBuilder implements Builder{

   // a lot of constructors and variables

 public Vehicle build() {
        return new Vehicle(brand, surnameBrand, type, engine, color, horsePower, maxSpeed, createdAt);
    }
}
```

and the interface:
```
public interface Builder {

    Builder brand(String Brand);

    Builder surnameBrand(String surnameBrand);

    Builder type(String Type);

    Builder engine(String engine);

    Builder color(String color);
    
    Builder horsePower(int horsePower);
    
    Builder maxSpeed(int maxSpeed);
    
    Builder createdAt(String createdAt);
    
}
```
So here in the code was used builder design pattern for separating the construction of an object from its representation,
and also by this class it's much easier to create objects insteand of using a lot of setters, an example of an object is 
created is here:
```
builder.brand("Bugatti")
                .surnameBrand("Chiron")
                .type("Hyper Car")
                .engine("6.5l")
                .color("black")
                .horsePower(1500)
                .maxSpeed(400)
                .createdAt("12 September 2020");
        Vehicle bugatti = builder.build();
```
### Prototype Design Pattern
* Specify the kinds of objects to create using a prototypical instance, and create new objects by copying this prototype.
* Co-opt one instance of a class for use as a breeder of all future instances.
* The __new__ operator considered harmful.

Implementation of the builder design pattern is the interface:
```
public interface Prototype {
    Vehicle clone();
}
```
and implementation of this interface:
```
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

    @Override
    public Vehicle clone() {
        return new Vehicle(this);
    }
```
So as following we are getting rid of repeated initialization code.

### Factory Method Design Pattern
* Define an interface for creating an object, but let subclasses decide which class to instantiate. Factory Method lets a class defer instantiation to subclasses.
* Defining a "virtual" constructor.
* The new operator considered harmful.

Implementation of the factory method design pattern:
So to be more explicit about the implementation, so as we know factory method is like a template method, we have here a base
which specifies all standard and generic behaviour which in the implementation is called CarFactory, which literally means
that industry that is making cars or smth like that:
```
public interface CarFactory {
    void create();
}
```
And two classes that are implementing the common behaviour of that base class which are SportCar and SuperCar, this means 
that can be created some types of cars Sport and Super cars:
```
public class SportCar implements CarFactory{
    @Override
    public void create() {
        System.out.println("Creating new Sport Car...");
    }
}

public class SuperCar implements CarFactory{
    @Override
    public void create() {
        System.out.println("Creating new Super Car...");
    }
}
```
And to test the example was created a dealership class which means that customer can to order a car by the type and the 
factory is creating the car.
```
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
```
### Abstract Factory Method Design Pattern
* Provide an interface for creating families of related or dependent objects without specifying their concrete classes.
* A hierarchy that encapsulates: many possible "platforms", and the construction of a suite of "products".
* The new operator considered harmful.

Implementation of the factory method design pattern:
So the purpose of the Abstract Factory is to provide an interface for creating families of related objects, without specifying 
concrete classes. So here in the implementation we have 2 companies Audi and Porsche which are producing engines and cars
they are too subclasses that inherit behaviour of main class Company
```
public abstract class Company {
    public abstract Engine createEngine();
    public abstract Car createCar();
}

public class Porsche extends Company{
    @Override
    public Engine createEngine() {
        return new PorscheEngine();
    }

    @Override
    public Car createCar() {
        return new PorscheCar();
    }
}
```
So these companies are producing engines and cars, for those products are created interface that gives possibility of extension
in case of they want to add something new to production, we have interfaces:
```
public interface ProductType {
    void create();
}

public interface Engine extends ProductType {
}

public interface Car extends ProductType{
}
```
PorductType is base interface which other 2 interfaces are inheriting main behavior create(), and after rest of the classes
are implementing this behavior, some examples are:
```
public class AudiCar implements Car {
    @Override
    public void create() {
        System.out.println("Audi Car was created!");
    }
}

public class PorscheEngine implements Engine{
    @Override
    public void create() {
        System.out.println("Porsche Engine was created!");
    }
}
```
### Conclusion 
In conclusion all creational design patterns were implemented successfully in one project about cars, in the proccess of work
was studied and recapitulated some theory about design patterns and practicing them.
