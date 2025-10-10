// Class demonstrating static members and static block
class Parent {

    // -------------------------
    // Static Variable
    // -------------------------
    static String variable = "Static variable"; // belongs to class, shared by all objects

    // -------------------------
    // Static Block
    // -------------------------
    static {
        System.out.println("Static block executed"); 
        // runs once when the class is loaded
    }

    // -------------------------
    // Static Method
    // -------------------------
    static void statmeth() {
        System.out.println("Static method called");
    }
}

// Main class to test functionality
public class Main {
    public static void main(String[] args) {
        // Creating object of Parent class
        Parent p1 = new Parent();

        // Access static variable via class name (recommended)
        System.out.println("Static variable: " + Parent.variable);

        // Call static method via class name
        Parent.statmeth();
    }
}
