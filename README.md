# Design Patterns Guide 📌

This document provides an overview of common design patterns used in software development, including their explanations and examples.

## 📖 Quick Navigation:
- [Creational Patterns](#1-creational-patterns-%EF%B8%8F)
- [Structural Patterns](#2-structural-patterns-)
- [Behavioral Patterns](#3-behavioral-patterns-)

---

## 1. Creational Patterns 🏗️
These patterns focus on **object creation mechanisms**, aiming to improve flexibility and reuse.

### 🔹 Singleton
- **Purpose:** Ensures that **only one instance** of a class is created.
- **Example-1 (E-commerce):** A **Cart Manager** that maintains a single instance for tracking user purchases across sessions.
- **Example-2 (Spring Core):** spring beans are singleton by default. Note: you can change it through @Scope

### 🔹 Factory Method
- **Purpose:** Provides an interface to **create objects** in a superclass while allowing subclasses to alter object creation.
- **Example-1 (E-commerce):** A **Payment Gateway Factory** that returns different payment methods dynamically.
- **Example-2 (Spring Core):** Crearing beans dynamically through Factory Method (@Bean , XML-Based) 
- **Example-3 (Spring Security):** A **PasswordEncoderFactories** create default types of password encoder based on predefined mapping

### 🔹 Abstract Factory
- **Purpose:** Provides an interface for **creating families of related or dependent objects** without specifying their concrete classes.
- **Example (E-commerce):** A **Product Factory** that produces different types of products, such as electronics and clothing.

### 🔹 Builder
- **Purpose:** Separates the **construction of a complex object** from its representation.
- **Example-1 (E-commerce):** A **Product Builder** that customizes a product with different features.
- **Example-2 (Spring Security):** **HttpSecurity**, create security rules.


### 🔹 Prototype
- **Purpose:** Allows cloning an object, reducing costly object creation.
- **Example (E-commerce):** Duplicating an **order template** for repeated purchases.

---

## 2. Structural Patterns 🏠
These patterns focus on **class composition** and the structure of relationships.

### 🔹 Adapter
- **Purpose:** Converts the **interface** of a class into another interface that clients expect.
- **Example (E-commerce):** Adapting **third-party shipping services** into a standard format.

### 🔹 Bridge
- **Purpose:** Separates **abstraction from implementation**, allowing independent development of each.  
- **Example (E-commerce):** If we want to implement multiple ways to present products—list view, grid view, or carousel.Instead of tightly coupling the product class with specific UI components, the Bridge pattern allows the platform to support multiple display formats while keeping the product data independent

### 🔹 Composite
- **Purpose:** Creates a **hierarchical structure** where individual objects and compositions are treated uniformly(Tree stucture).  
- **Example-1 (E-commerce):** Organizing products into categories and subcategories—such as "Electronics > Smartphones > Accessories"—where each level behaves consistently.
- **Example-2 :** Organize folders and files.

### 🔹 Decorator
- **Purpose:** Allows us to **add new functionality** to an object without modifying its existing structure.
- **Example (E-commerce):** Adding **discounts** dynamically to a product.(allow to add or remove it)

### 🔹 Facade
- **Purpose:** Provides a **simplified interface** to **complex subsystems**, improving ease of use.
- **Example (E-commerce):** A unified checkout process that manages payment processing, inventory updates, and shipping arrangements behind the scenes, so users only interact with a single **"Complete Purchase"** button.

### 🔹 Flyweight
- **Purpose:** Used to **optimize memory usage** by sharing common objects instead of **creating multiple instances** of the same data.
- **Example (E-commerce):** If products have same attributes(Size, Color) instead of creating a separate object for every product we can reuse a shared "ProductTemplate" object that contains common attributes  
    
### 🔹 Proxy
- **Purpose:** Controls access to an object, adding security or caching mechanisms.  
- **Example-1 (E-commerce):** Restricting certain premium features, like advanced product recommendations, to logged-in users while providing basic suggestions to guests.
- **Example-2 (Spring AOP):** Used for method interception and aspect-oriented programming (JDK dynamic proxy: used when the bean implements the class, CGLIB: used when bean doesn't implement an interface).
- **Example-3 (Spring Security):** **DelegatingFilterProxy**, act like bridge between the servlet container and spring's security filter chain.
  
---

## 3. Behavioral Patterns 🤖
These patterns **define interactions** between objects.

### 🔹 Chain of Responsibility
- **Purpose:** Passes a **request** through a chain of handlers until **one processes** it.
- **Example-1 (E-commerce):** **Order processing pipeline**, where different validation steps occur sequentially (payment, stock check, shipment).
- **Example-2 (Spring Security):** **SecurityFilerChain** maintains a **filter chain** where each filter has a specific responsibility.

### 🔹 Command
- **Purpose:** Encapsulates a request as an object to allow undo/redo functionality.
- **Example (E-commerce):** in Shopping cart actions like **adding/removing items** and **undoing changes**.

### 🔹 Interpreter
- **Purpose:** Defines a way to interpret and evaluate language grammar or expressions.
- **Example (E-commerce):** **Search filters**, where users enter queries like "price < $50" and the system interprets them.

### 🔹 Iterator
- **Purpose:** Traverse element of collection without know how it stored/structured
- **Example:** Iterates on posts of Facebook -> Post class, PostIterator

### 🔹 Mediator
- **Purpose:** Centralizes and manages **communication between objects** to reduce dependencies.
- **Example (E-commerce):** Customer support system where a mediator routes queries to the appropriate department.
- **Example:** Traffic man 

### 🔹 Memento
- **Purpose:** Captures and restores an object’s internal state without violating encapsulation.
- **Example:** **Shopping cart recovery**, allowing users to restore their cart after accidental changes.

### 🔹 Observer
- **Purpose:** Allows multiple objects to be notified when a **state changes**.
- **Example-1 (E-commerce):** **Customers subscribing** to product updates.
- **Example-2 (Spring AOP):** **@EventListner** Spring event listeners notify components of changes.
 
### 🔹 State
- **Purpose:** Allows an object to **change behavior** when its internal state changes (reduce if-conditions).
- **Example (E-commerce):** Order lifecycle, transitioning from "Pending" to "Shipped" to "Delivered."

### 🔹 Strategy
- **Purpose:** Defines a family of algorithms and allows **selecting one algorithm dynamically** at runtime.
- **Example-1 (E-commerce):** Choosing different **sorting algorithms** for product recommendations(Price-based, Size-based).
- **Example-2 (Spring Security):** **PasswordEncoder**

### 🔹 Template Method
- **Purpose:** Defines a **skeleton** of an algorithm and allows subclasses to **customize steps**.
- **Example:** Checkout process where different **payment methods** modify only specific parts of the workflow.

---

## 🎯 Resources
- Software Design(Material)
- [Refactoring.GURU](https://refactoring.guru/design-patterns)
- [DevGeeks Academy](https://youtube.com/playlist?list=PLd-dOEgzBpGnt3GuEszo_piQq52XSqAmj&si=7LA8TbIRBUe2srZG)
