package structural_patterns.composite_pattern;

// Component interface: This is the common interface that both leaves and composites implement.
// This interface defines the operation() method that will be used by both individual objects (leaves)
// and groups of objects (composites).
public interface Component {
    // A method that will be implemented by both Leaf and Composite classes.
    // This method represents an operation that can be performed on the component.
    void operation();
}
