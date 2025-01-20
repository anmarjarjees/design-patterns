package structural_patterns.adpater_pattern;
// OldSystem class: This class represents an old system that provides data in an outdated format.
// The method getOldData() returns the data that the old system produces.

// OldSystem: Represents the system we want to adapt:
public class OldSystem {
    // This method returns data in the old format (a simple string here).
    public String getOldData() {
        return "Old Data"; // Returns data from the old system
    }
}
