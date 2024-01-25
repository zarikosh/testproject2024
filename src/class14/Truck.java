package class14;

public class Truck extends Vehicle {

    //final keyword:
    //1. final variable - constant, cannot be changed after initializing it
    //2. final method - cannot change/ override method
    //3. final class - cannot be inherited
    String capacity;
    final String name = "Truck";

    // Access modifier should be the same level or more accessible
    @Override

    public void makeSound(){ //method signature - method name + arguments + return types
        super.makeSound();
        System.out.println("Truck sound!");
        System.out.println("name:" + super.name);


    }
}
