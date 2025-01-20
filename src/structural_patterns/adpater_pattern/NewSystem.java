package structural_patterns.adpater_pattern;

// NewSystem class: This is the new system that expects data in a specific format.
// It uses the method displayData() to display data.

// NewSystem: Represents the system that expects data in a different format:
public class NewSystem {
    // This method expects data in a new format and prints it to the console.
    public void displayData(String data) {
        System.out.println("New System displays: " + data); // Prints the data to the console
    }
}