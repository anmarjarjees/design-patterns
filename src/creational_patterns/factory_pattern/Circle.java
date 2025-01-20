package creational_patterns.factory_pattern;
/* 
 * Create Concrete Product Classes (Circle.java, Rectangle.java, Triangle)
 * > These are the actual objects (products) that will be created by the Factory. 
 * > Each product implements the Shape interface.
    Circle.java
    Rectangle.java
    > this class implements the Shape interface and provide its own behavior for the draw() method.
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}
