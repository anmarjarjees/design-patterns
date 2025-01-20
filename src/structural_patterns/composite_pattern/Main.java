package structural_patterns.composite_pattern;

public class Main {
    public static void main(String[] args) {
        // Create leaf objects (individual objects in the tree structure).
        Component leaf1 = new Leaf("Leaf 1");
        Component leaf2 = new Leaf("Leaf 2");

        // Create a composite object (a container for other components).
        Composite composite = new Composite();
        composite.add(leaf1); // Add leaf1 to the composite
        composite.add(leaf2); // Add leaf2 to the composite

        // Perform the operation on the composite object.
        // The composite will also perform the operation on its children (leaf1 and leaf2).
        composite.operation(); // Calls the operation() method for all components in the composite
    }
}

