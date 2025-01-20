/* 
 * 1. The Product Interface (Shape.java:
 * > The Product Interface defines the common interface for all objects that will be created by the Factory. Every concrete product (ex: Circle, Rectangle) will implement this interface.
 * > all shapes (like Circle, Rectangle, etc.) will share a common behavior (draw() method).
 */

package creational_patterns.factory_pattern;

public interface Shape {
    void draw();
}

