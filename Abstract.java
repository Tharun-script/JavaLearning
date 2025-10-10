// Abstract class representing a generic Cat
abstract class Cat {

    // -------------------------
    // Instance Variables
    // -------------------------
    int nums = 5;                 // regular instance variable
    final String legs = "final";  // final instance variable (constant)

    // -------------------------
    // Static Variables
    // -------------------------
    static String numss = "Static";  // static variable (shared across all instances)

    // -------------------------
    // Constructor
    // -------------------------
    Cat() {
        System.out.println("Cat constructor called");
    }

    // -------------------------
    // Abstract Method
    // -------------------------
    abstract void sound();  // must be implemented by subclass

    // -------------------------
    // Concrete Methods
    // -------------------------
    
    // Normal instance method
    void normeth() {
        System.out.println("Normal method");
    }

    // Static method
    static void statmeth() {
        System.out.println("Static method");
    }

    // Final method (cannot be overridden)
    final void finmeth() {
        System.out.println("Final method");
    }
}

// Concrete subclass of Cat
class Animal extends Cat {

    // Implementation of abstract method
    @Override
    void sound() {
        System.out.println("meow");
        System.out.println("Instance variable nums: " + nums);
    }
}

// Main class to test the functionality
public class Main {
    public static void main(String[] args) {

        // Upcasting: reference of type Cat pointing to Animal object
        Cat a1 = new Animal();

        // Call abstract method (implemented in subclass)
        a1.sound();

        // Call normal instance method from abstract class
        a1.normeth();

        // Access static variable via class
        System.out.println("Static variable: " + Animal.numss);

        // Access final instance variable
        System.out.println("Final variable legs: " + a1.legs);

        // Call static method
        Animal.statmeth();

        // Call final method
        a1.finmeth();
    }
}
