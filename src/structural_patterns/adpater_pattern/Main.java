package structural_patterns.adpater_pattern;

public class Main {
    public static void main(String[] args) {
        // Create an instance of the OldSystem
        OldSystem oldSystem = new OldSystem();

        // Create an Adapter object that adapts the old system to the new system's format
        Adapter adapter = new Adapter(oldSystem);

        // Create an instance of the NewSystem
        NewSystem newSystem = new NewSystem();

        // Now use the adapter to get the data in the correct format for the NewSystem
        // The Adapter makes sure the old system's data can be used by the new system
        newSystem.displayData(adapter.getData()); // Display the data using the new system
    }
}
