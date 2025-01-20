package creational_patterns.singleton_pattern;

// Main class to test the Singleton pattern
public class SingletonDemo {
    public static void main(String[] args) {
        // Step 5: Get the single instance of Singleton using the getInstance() method
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        // Step 6: Check if both instances are the same
        System.out.println("Are both instances the same? " + (singleton1 == singleton2));

        // Step 7: Call a method on the Singleton instance
        singleton1.showMessage();
    }
}