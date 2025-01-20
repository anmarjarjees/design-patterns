package behavioral_patterns.observer_pattern;

// Main class: The client that creates the subject (weather station) and observers (display units).
// It simulates a state change in the subject, which notifies the observers.
public class Main {
    public static void main(String[] args) {
        // Create a concrete subject (weather station).
        ConcreteSubject weatherStation = new ConcreteSubject();

        // Create concrete observers (display units).
        ConcreteObserver display1 = new ConcreteObserver("Display 1");
        ConcreteObserver display2 = new ConcreteObserver("Display 2");

        // Attach the observers to the subject.
        weatherStation.attach(display1);
        weatherStation.attach(display2);

        // Change the state of the subject and notify the observers.
        weatherStation.setState("Weather is sunny"); // Both displays will be notified.
        weatherStation.setState("Weather is cloudy"); // Both displays will be notified again.
    }
}
