package behavioral_patterns.observer_pattern;

// Observer interface: This is the common interface that all concrete observers will implement.
// It defines the update() method, which is called when the subject's state changes.
public interface Observer {
    void update(String message); // Method to update the observer with the new message.
}
