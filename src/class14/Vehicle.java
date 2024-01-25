package class14;

public class Vehicle {
        public String name = "Vehicle";
        protected String model;

        protected String strProtected; // would be available in the same package, plus, would give an access to a child class
        String strDefault; // default is available in the same package
        private String strPrivate;

        public void makeSound() {
            System.out.println("Some sound");
        }
    }
