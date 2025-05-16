# Design Patterns Guide 📌

This document provides an overview of common design patterns used in software development, including their explanations and examples. It is designed for students and aims to be **simple, structured, and easy to navigate**.

## 📖 Quick Navigation:
- [1. Creational Patterns](#creational-patterns)
- [2. Structural Patterns](#structural-patterns)
- [3. Behavioral Patterns](#behavioral-patterns)

---

## 1. Creational Patterns 🏗️
These patterns deal with **object creation** mechanisms, aiming to increase flexibility and reuse.

### 🔹 Singleton
- **Purpose:** Ensures only **one instance** of a class is created.
- **Example (E-commerce):** A **Cart Manager** that maintains a single instance for tracking user purchases across sessions.
```python
class CartManager:
    _instance = None

    def __new__(cls):
        if cls._instance is None:
            cls._instance = super(CartManager, cls).__new__(cls)
        return cls._instance

cart1 = CartManager()
cart2 = CartManager()
print(cart1 is cart2)  # Output: True
