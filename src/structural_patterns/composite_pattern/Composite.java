package structural_patterns.composite_pattern;

// Composite class: This class represents a collection of components. A composite object can contain both
// individual leaves and other composite objects, allowing us to treat everything uniformly.
import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
    private List<Component> children = new ArrayList<>(); // A list to store child components (both leaves and other composites).

    // Add a child component (either a leaf or another composite).
    public void add(Component component) {
        children.add(component); // Add the component to the list
    }

    @Override
    public void operation() {
        // Perform the operation for the composite, and then delegate the operation to all of its children
        System.out.println("Composite operation performed.");

        // Iterate through all children and call their operation method
        for (Component child : children) {
            child.operation(); // Recursively call operation() on each child (leaf or composite)
        }
    }
}
