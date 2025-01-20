# Design Patterns
This repository is part of the needed materials as an extra help for my course "Object Oriented Analysis with UML" for ["EFREI University - Software Engineering Master Program"](https://eng.efrei.fr/graduate-programs/software-engineering/). This repository contains demonstrating samples of "Design Patterns" according to the course outlines using Java language.
For more details and explanations refer to my comprehensive PDF documents and materials in the LMS. 

This Java project showcasing examples of key software engineering design patterns. This repository contains three packages, each demonstrating a different category of design patterns:
- **Behavioral Pattern:** Examples of patterns focused on object communication and responsibility assignment.
- **Creational Pattern:** Patterns that deal with object creation mechanisms.
- **Structural Pattern:** Patterns concerned with the composition of classes and objects.

# Packages and Code Files Sequence:
- creational_patterns
    - singleton_pattern
        - Singleton.java - Singleton class
        - SingletonDemo.java - Demonstrates Singleton pattern
    - factory_pattern
        - Shape.java - The Shape interface.
        - Circle.java - Concrete Circle product.
        - Rectangle.java - Concrete Rectangle product.
        - ShapeFactory.java - Factory that creates objects based on input.
        - ShapeFactoryDemo.java - Demo of how to use the factory to create objects.
        - Optional: Triangle.java - An additional product to extend the factory.
- structural-patterns
    - adapter_pattern:
        - OldSystem.java
            > This class represents the existing system with a method getOldData() that returns the data in an outdated format. It's a simple system that works fine on its own, but it doesn't match the format the NewSystem expects.
        - NewSystem.java
            > The NewSystem class needs data in a specific format. The displayData() method accepts data in that new format and displays it on the screen.
        - Adapter.java
            > The Adapter class is where the magic happens. It allows us to use the OldSystem with the NewSystem by making the old system's data compatible with the new system's expectations. The Adapter simply "wraps" the old system and provides a method getData() that makes it look like the data is in the correct format.
        - Main.java
            > In the Main class, we create instances of the OldSystem and the NewSystem. The Adapter is used to allow the NewSystem to receive the data from the OldSystem without changing the old system itself.
    - composite_pattern:
        - Component.java
            >  Component Interface: Common interface for all objects (both Leaf and Composite). This interface defines the operation() method, which will be implemented by both Leaf and Composite classes. The goal is to allow both types of objects to be treated uniformly.
        - Leaf.java
            >  This class represents an individual object in the structure. The simple objects in the tree structure (individual, end-point objects). It performs the operation() method on its own, which in this case, just prints a message. A Leaf has no children.
        - Composite.java
            > The container or group that holds other components (which can be other composites or leaves). This class is a container that can hold other Component objects, whether they are Leaf or other Composite objects. The operation() method in the Composite calls the operation() method on all of its children, which could be either leaves or other composites. This is where the recursive behavior happens.
        - Main.java
            > In the Main class, we create a few Leaf objects and add them to a Composite object. When we call the operation() method on the composite, it calls the operation() method on all its children (in this case, the Leaf objects)
- behavioral_patterns
    - command_pattern: 
        - Command.java (The Command Interface)
            > Command Interface: The base interface for all concrete command classes.This interface defines the execute() method that all concrete commands must implement. This allows the system to treat different commands in a uniform way.
        - LightOnCommand.java (Concrete Command)
            > Concrete Command: The LightOnCommand class is a concrete implementation of the Command interface. It contains the action (light.turnOn()) to be executed when the command is triggered.
        - Light.java (Receiver)
            > Receiver: The Light class represents the receiver in the Command Pattern. It knows how to perform the actual action (turning on or off the light).
        - RemoteControl.java (Invoker)
            > Invoker: The RemoteControl class acts as the invoker. It holds a reference to the Command and calls execute() on it when the user triggers the action (pressing a button).
        - Main.java (Client)
            > Client: In the Main class, we create instances of the receiver, command, and invoker. When the user presses the button, the invoker calls the command to execute the action.
    - observer_pattern:
        - Observer.java (Observer Interface)
            > Observer Interface: This interface defines the update() method, which will be called when the subject's state changes. All concrete observers will implement this method.
        - ConcreteObserver.java (Concrete Observer)
            > Concrete Observer: The ConcreteObserver class implements the Observer interface. It defines how the observer responds to state changes in the subject. In this case, it prints a message to indicate the update.
        - Subject.java (Subject Interface)
            > Subject Interface: This interface defines the methods to attach, detach, and notify observers. It allows observers to subscribe to or unsubscribe from updates.
        - ConcreteSubject.java (Concrete Subject)
            > Concrete Subject: The ConcreteSubject class implements the Subject interface. It maintains a list of observers and notifies them whenever its state changes. The state is set using the setState() method, which triggers a notification to all registered observers.
        - Main.java (Client)
            > Client: In the Main class, we create an instance of the subject and two observers. The observers are attached to the subject, and when the state of the subject changes, the observers are notified.

---
# Credits, References, and Recourses: 
- **Book:** The "Gang of Four" (Design Patterns: Elements of Reusable Object-Oriented Software):
    - [Google Books - Design Patterns: Elements of Reusable Object-Oriented Software](https://books.google.ca/books/about/Design_Patterns.html?id=6oHuKQe3TjQC&redir_esc=y)
    - [Design Patterns: Elements of Reusable Object-Oriented Software](https://en.wikipedia.org/wiki/Design_Patterns)

- **Book:** CORE Java - Volume 1: Fundamentals 12th Edition by Cay Horstmann
    - [Google Books - Core Java Fundamentals, Volume 1 By Cay S. Horstmann · 2021](https://www.google.ca/books/edition/Core_Java/JLmYzgEACAAJ?hl=en)
- **Book:** The Unified Modeling Language User Guide 2nd Edition by Grady Booch, James Rumbaugh, and Ivar Jacobson
    - [Google Books - Guide By Grady Booch · 2005](https://www.google.ca/books/edition/The_Unified_Modeling_Language_User_Guide/xfQ8JCbxDK8C?hl=en)

- [Refactoring Guru - Design Patterns Guide](https://refactoring.guru/design-patterns)

- [Java Tutorial (Official Oracle Documentation)](https://docs.oracle.com/javase/tutorial/)

---
---
# VS Code README.md Template
Notice that all the content below are automatically generated by VS Code:

## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
