// Class demonstrating use of 'this' keyword in Java
// Shows three common uses:
// 1. Calling another constructor (constructor chaining)
// 2. Referring to instance variables
// 3. Calling another method of the same class

class Thisex {
    // Instance variable of the class
    String variable;

    // No-argument constructor
    // Calls the parameterized constructor using 'this()'
    Thisex() {
        // Constructor chaining: reuse the parameterized constructor
        this("tharun"); // sets default value for 'variable'
        System.out.println("No-argument constructor called");
    }

    // Parameterized constructor
    Thisex(String variable) {
        // 'this.variable' refers to the instance variable
        // 'variable' on the right-hand side is the parameter
        this.variable = variable;
        System.out.println("Parameterized constructor called with variable: " + variable);
    }

    // Method to display the value of 'variable'
    void display() {
        System.out.println("Display: " + variable);
    }

    // Method demonstrating 'this' calling another method
    void welcome() {
        System.out.print("Welcome method calls -> ");
        this.display(); // explicitly calls display() of this object
    }
}

class Main {
    public static void main(String[] args) {
        // Create object using no-argument constructor
        Thisex t1 = new Thisex(); // variable will be set to "tharun"

        // Create object using parameterized constructor
        Thisex t2 = new Thisex("This variable"); // variable will be set to "This variable"

        // Calling display() and welcome() methods
        System.out.println("\nUsing t1 object:");
        t1.display();   // prints variable of t1
        t1.welcome();   // calls display() via welcome()

        System.out.println("\nUsing t2 object:");
        t2.display();   // prints variable of t2
        t2.welcome();   // calls display() via welcome()
    }
}
