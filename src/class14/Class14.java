package class14;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class14 {
//    public static void main(String[] args) {
//        //Java/OOP concepts:
//        //1. Encapsulation - hiding the fields (private, getters and setters)
//        //2. Inheritance
//        //3. Polymorphism
//        //4. Abstraction
//
//         Vehicle vehicle = new Vehicle();
//         Truck truck = new Truck();
//
////         truck.strDefault = "";
////         truck.strProtected = "";
//
////         truck.pullContainer();
////         truck.makeSound();
////
////         truck.name ="Truck name";
////         truck.model = "model name"
//
//        //METHOD OVERRIDING - using the same method in the child class (changing the functionality in the parent)
//        //METHOD overloading - using the same method many times with different arguments
//        truck.makeSound();

        //POLYMORPHISM

//    }

    public static void main(String[] args) {
        Animal animal = new Animal();
//        animal.move();

        Animal cat = new Cat();
//        cat.move();
//
//        WebDriver driver = new ChromeDriver();
        animalMovements(cat);
    }
    public static void animalMovements(Animal animal){
        animal.move();


    }
}
