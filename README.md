# Design Patterns Guide 📌

This document provides an overview of common design patterns used in software development, including their explanations and examples. It is designed for students and aims to be **simple, structured, and easy to navigate**.

## 📖 Quick Navigation:
- [Creational Patterns](#-creational-patterns)
- [Structural Patterns](#-structural-patterns)
- [Behavioral Patterns](#-behavioral-patterns)

---

## 1. Creational Patterns 🏗️
These patterns focus on **object creation mechanisms**, aiming to improve flexibility and reuse.

### 🔹 Singleton
- **Purpose:** Ensures that **only one instance** of a class is created.
- **Example (E-commerce):** A **Cart Manager** that maintains a single instance for tracking user purchases across sessions.

### 🔹 Factory Method
- **Purpose:** Provides an interface to **create objects** in a superclass while allowing subclasses to alter object creation.
- **Example (E-commerce):** A **Payment Gateway Factory** that returns different payment methods dynamically.

### 🔹 Abstract Factory
- **Purpose:** Provides an interface for **creating families of related or dependent objects** without specifying their concrete classes.
- **Example (E-commerce):** A **Product Factory** that produces different types of products, such as electronics and clothing.

### 🔹 Builder
- **Purpose:** Separates the **construction of a complex object** from its representation.
- **Example (E-commerce):** A **Product Builder** that customizes a product with different features.

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
- **Example1 (E-commerce):** Organizing products into categories and subcategories—such as "Electronics > Smartphones > Accessories"—where each level behaves consistently.
- **Example2 :** Organizing folders and files.

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
- **Example (E-commerce):** Restricting certain premium features, like advanced product recommendations, to logged-in users while providing basic suggestions to guests.
  
---

## 3. Behavioral Patterns 🤖
These patterns **define interactions** between objects.

### 🔹 Observer
- **Purpose:** Allows multiple objects to be notified when a **state changes**.
- **Example (E-commerce):** **Customers subscribing** to product updates.

### 🔹 Strategy
- **Purpose:** Allows selecting an **algorithm dynamically**.
- **Example (E-commerce):** Choosing different **sorting algorithms** for product recommendations.

---

## 🎯 Conclusion
This guide presents **essential design patterns** with clear explanations and **real-world applications** in e-commerce. Bookmark the Quick Navigation for fast access.

