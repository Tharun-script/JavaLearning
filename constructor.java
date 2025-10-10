// Class demonstrating a normal (default) constructor
class NormalConstructor {
    int age = 10; // instance variable

    // Default constructor
    NormalConstructor() {
        System.out.println("Default constructor called");
    }
}

// Class demonstrating a parameterized constructor
class ParameterizedConstructor {
    // Parameterized constructor
    ParameterizedConstructor(int a, int b) {
        System.out.println("Sum of a and b: " + (a + b));
    }
}

// Class demonstrating a copy constructor
class CopyConstructor {
    int age;

    // Regular constructor
    CopyConstructor(int age) {
        this.age = age;
    }

    // Copy constructor: creates a new object by copying values from another object
    CopyConstructor(CopyConstructor obj) {
        this.age = obj.age;
        System.out.println("Copy constructor called, age: " + this.age);
    }
}

// Main class to test all types of constructors
public class Main {
    public static void main(String[] args) {
        
        // Using default constructor
        NormalConstructor n1 = new NormalConstructor();

        // Using parameterized constructor
        ParameterizedConstructor p1 = new ParameterizedConstructor(10, 20);

        // Using copy constructor
        CopyConstructor original = new CopyConstructor(30); // original object
        CopyConstructor copy = new CopyConstructor(original); // copy object
    }
}
