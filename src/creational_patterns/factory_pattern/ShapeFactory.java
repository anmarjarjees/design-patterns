package creational_patterns.factory_pattern;
/* 
 * Creating the "Factory Class" (ShapeFactory.java)
 * > The Factory class contains the logic for creating objects.
 * > The factory method is the entry point that returns the desired object, based on a parameter passed (in this case, the shape type)
 * > ShapeFactory class handles the decision-making for object creation. Depending on the input (like "CIRCLE" or "RECTANGLE"), it returns the appropriate concrete object.

 To summarize:
  * This file is the "Factory Pattern" which allows us to easily add new types of objects without changing the existing code too much. 
 * We just need to update the ShapeFactory class to handle the new type.
 */
// Update the ShapeFactory to handle the new Triangle product

public class ShapeFactory {
    
    // Factory method to get the required Shape object
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("TRIANGLE")) {
            return new Triangle();
        }
        
        return null;
    }
}