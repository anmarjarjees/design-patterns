package behavioral_patterns.command_pattern;

// Light class: The receiver class that knows how to perform the actual action (turning on or off).
public class Light {
    // Method to turn on the light.
    public void turnOn() {
        System.out.println("The light is ON!");
    }

    // Method to turn off the light.
    public void turnOff() {
        System.out.println("The light is OFF!");
    }
}
