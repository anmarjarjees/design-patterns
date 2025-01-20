package creational_patterns.singleton_pattern;

// Singleton class
public class Singleton {

    // Step 1: Create a private static instance of the class (null initially)
    private static Singleton instance;

    // Step 2: Private constructor to prevent instantiation from outside the class
    private Singleton() {
        // You can initialize resources here if needed
    }

    // Step 3: Public static method to provide global access to the instance
    public static Singleton getInstance() {
        // Step 4: Initialize the instance only once
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // A method to show that the Singleton works
    public void showMessage() {
        System.out.println("Hello from the Singleton instance!");
    }
}



/* 
Private static instance:
A private static variable instance of the class is created, which will hold the only instance of the class.

Private constructor:
The constructor is made private to prevent the instantiation of the class from outside. This ensures that the class cannot be instantiated directly using new.

Public static method (getInstance()):
The getInstance() method checks if the instance is null. If it is, it creates the instance; otherwise, it returns the existing instance. This ensures that only one instance of the class is created (lazy initialization).

Global access:
The instance is accessed via the getInstance() method, which guarantees that only one instance of the class is used throughout the program.

Singleton Check:
In the main method, we create two variables (singleton1 and singleton2) using getInstance(). The comparison singleton1 == singleton2 checks if both references point to the same instance, which they will because of the Singleton pattern.

 */