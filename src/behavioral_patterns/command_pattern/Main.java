package behavioral_patterns.command_pattern;

// Main class: The client that creates instances of the receiver, command, and invoker.
// It simulates pressing a button to turn on the light.
public class Main {
    public static void main(String[] args) {
        // Create a receiver (Light).
        Light light = new Light();

        // Create a concrete command (LightOnCommand).
        Command lightOn = new LightOnCommand(light);

        // Create an invoker (RemoteControl) and set the command.
        RemoteControl remote = new RemoteControl(lightOn);

        // Press the button to execute the command (turn on the light).
        remote.pressButton(); // Output: "The light is ON!"
    }
}
