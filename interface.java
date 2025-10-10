// Interface defining behaviors
interface Example {
    // Abstract method (must be implemented by subclasses)
    void normeth();

    // Default method (has a body, optional to override)
    default void defmeth() {
        System.out.println("Default method");
    }

    // Static method (can be called using interface name)
    static void statmeth() {
        System.out.println("Static method");
    }

    // Interface variable (implicitly public static final)
    String var = "variable";
}

// Concrete class implementing the interface
class Subclass implements Example {
    @Override
    public void normeth() { // Must be public
        System.out.println("Normal method");
    }

    // Optional: override default method if needed
    // @Override
    // public void defmeth() {
    //     System.out.println("Overridden default method");
    // }
}

// Main class to test functionality
public class Main {
    public static void main(String[] args) {
        Example e1 = new Subclass(); // Upcasting to interface

        // Call abstract method implemented in subclass
        e1.normeth();

        // Call default method (optional override)
        e1.defmeth();

        // Call static method (must be called via interface name)
        Example.statmeth();

        // Access interface variable (must be via interface name)
        System.out.println("Variable: " + Example.var);
    }
}
