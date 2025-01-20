package behavioral_patterns.command_pattern;

// Command interface: This is a common interface that all concrete commands will implement.
// It defines the "execute" method, which will be called to perform an action.
public interface Command {
    void execute(); // A method to execute the command.
}