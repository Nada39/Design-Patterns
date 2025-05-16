package Prototype;


// SOLID principles
// Single responsibility: Cloning instead of instantiation.
// Open/Closed: New object variations can be introduced without altering the cloning mechanism.
// Liskov substitution

// Cloning complex objects that have circular references might be very tricky.

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setX(1);
        circle.setY(3);
        circle.setRadius(2);
        System.out.println(circle.hashCode());

        Circle Circle2 = new Circle(circle);
        System.out.println(Circle2.getRadius());
        System.out.println(Circle2.hashCode());

        Shape clonedCircle = Circle2.clone();
        System.out.println(Circle2.getRadius());
        System.out.println(clonedCircle.hashCode());

    }
}
