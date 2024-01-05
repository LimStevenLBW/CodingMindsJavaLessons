public class Car {
    // Package private by default
    int name;
    String color;

    /*
     * In Java, when a class does not have any constructor defined, the compiler
     * automatically provides a default constructor. This default constructor
     * initializes the instance variables to their default values (0 for numeric
     * types, false for boolean, and null for objects). By providing this default
     * constructor, the compiler ensures that an object of the class can still be
     * created and used, even if no explicit constructor is defined.
     */
    public Car() {
        // This is called by child classes, mandatory
        System.out.println("I'm a car, yes, cars talk in the future");
    }

    public Car(int name, String color) {

    }

    public void Honk() {
        System.out.println("Generic Car noise");
    }
}
