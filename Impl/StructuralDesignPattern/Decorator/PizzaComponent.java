package StructuralDesignPattern.Decorator;

public interface PizzaComponent {
    public int cost();
    public String Description();
}


/*. Adapter Pattern
Liskov Substitution Principle (LSP): Ensures that different implementations can replace one another without altering the system.

Dependency Inversion Principle (DIP): Decouples high-level modules from low-level ones by using abstractions.

2. Decorator Pattern
Open/Closed Principle (OCP): Allows extending functionalities (like applying discounts) without modifying existing code.

Single Responsibility Principle (SRP): Ensures that each decorator adds a single responsibility without affecting core object behavior.

3. Proxy Pattern
Single Responsibility Principle (SRP): Separates access control logic from core functionality.

Dependency Inversion Principle (DIP): Allows high-level components to depend on abstractions instead of direct implementations.

4. Composite Pattern
Liskov Substitution Principle (LSP): Treats both individual products and product categories uniformly.

Open/Closed Principle (OCP): Enables new hierarchical structures without modifying existing code.

5. Facade Pattern
Single Responsibility Principle (SRP): Provides a simplified interface while hiding complex subsystem interactions.

Dependency Inversion Principle (DIP): Ensures high-level modules interact only with abstractions instead of specific implementations.

6. Bridge Pattern
Open/Closed Principle (OCP): Allows new implementations without modifying existing abstractions.

Dependency Inversion Principle (DIP): Separates abstraction and implementation layers, reducing tight coupling. */