package creational_patterns.factory_pattern;
/* 
This class demonstrates how the Factory Pattern works in action. 
We can see how the client interacts with the Factory class 
to create objects without directly instantiating them.

This class shows the client code. The client does not need to know about the classes Circle or Rectangle. 
It only interacts with the factory (ShapeFactory) to get the desired shape, demonstrating the separation of concerns that the Factory Pattern provides. 
 */
public class ShapeFactoryDemo {
    public static void main(String[] args) {
        
        ShapeFactory shapeFactory = new ShapeFactory();
        
        // Get a Circle object using the Factory method
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();  // Output: Drawing a Circle
        
        // Get a Rectangle object using the Factory method
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();  // Output: Drawing a Rectangle
    }
}