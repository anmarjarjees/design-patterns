package behavioral_patterns.observer_pattern;

// ConcreteSubject class: A concrete implementation of the Subject interface.
// It maintains the list of observers and notifies them when its state changes.
import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {
    private List<Observer> observers = new ArrayList<>(); // List of attached observers.
    private String state; // The state of the subject, which will trigger updates.

    // Attach an observer to the list.
    @Override
    public void attach(Observer observer) {
        observers.add(observer); // Add observer to the list.
    }

    // Detach an observer from the list.
    @Override
    public void detach(Observer observer) {
        observers.remove(observer); // Remove observer from the list.
    }

    // Notify all observers of a state change.
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(state); // Notify each observer with the new state.
        }
    }

    // Set the state and notify observers of the change.
    public void setState(String state) {
        this.state = state; // Set the new state.
        notifyObservers(); // Notify observers of the state change.
    }
}
