package behavioral_patterns.observer_pattern;

// Subject interface: This is the common interface that the subject will implement.
// It defines methods for attaching, detaching, and notifying observers.
public interface Subject {
    void attach(Observer observer); // Method to attach an observer.
    void detach(Observer observer); // Method to detach an observer.
    void notifyObservers(); // Method to notify all observers of a change.
}
