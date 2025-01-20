package behavioral_patterns.observer_pattern;

// ConcreteObserver class: A concrete implementation of the Observer interface.
// It will receive updates from the subject (weather station).
public class ConcreteObserver implements Observer {
    private String name; // The name of the observer.

    // Constructor to set the observer's name.
    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        // Print the received message to show that the observer was updated.
        System.out.println(name + " received update: " + message);
    }
}

