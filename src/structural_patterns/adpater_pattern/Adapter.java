package structural_patterns.adpater_pattern;

// Adapter class: This class serves as an adapter between the old system and the new system.
// It adapts the old system's interface to work with the new system's expected format.

// Adapts the old system's interface to make it compatible with the new system
public class Adapter {
    private OldSystem oldSystem; // A reference to the old system.

    // Constructor: The Adapter needs an instance of the old system to adapt it.
    public Adapter(OldSystem oldSystem) {
        this.oldSystem = oldSystem; // Save the old system reference
    }

    // This method adapts the old system's data to the new system's format.
    public String getData() {
        return oldSystem.getOldData(); // Simply return the old data to be used in the new system
    }
}
