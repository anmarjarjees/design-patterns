package behavioral_patterns.command_pattern;

// LightOnCommand class: A concrete command that turns on the light.
// It implements the Command interface and calls the action on the Receiver.
public class LightOnCommand implements Command {
    private Light light; // The receiver of the command.

    // Constructor takes the light (receiver) object as a parameter.
    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn(); // Execute the command (turn on the light).
    }
}
