package structural_patterns.composite_pattern;

// Leaf class: A simple object that implements the Component interface. It represents an individual object
// in the composite structure.
public class Leaf implements Component {
    private String name; // The name of the leaf, for identification purposes.

    // Constructor to initialize the name of the leaf.
    public Leaf(String name) {
        this.name = name; // Set the name of the leaf
    }

    @Override
    public void operation() {
        // Perform the operation for the leaf object (in this case, print a message).
        System.out.println("Leaf " + name + " operation performed.");
    }
}

