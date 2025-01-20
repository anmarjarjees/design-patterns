package behavioral_patterns.command_pattern;

// RemoteControl class: The invoker that will call the command to execute an action.
// It holds a command and invokes its execute() method when triggered.
public class RemoteControl {
    private Command command; // A command to execute.

    // Constructor that accepts a command.
    public RemoteControl(Command command) {
        this.command = command;
    }

    // Method to press the button and execute the command.
    public void pressButton() {
        command.execute(); // Execute the command.
    }
}
