package StructuralDesignPattern.Decorator;

// wrap the object with a new layer that provides additional behaviors
// it dependes on the order

//SOLID principles:
//Open/Closed: Allows extending functionalities (like applying different grediants) without modifying existing code.
//Single Responsibility: You can divide a monolithic class that implements many possible variants of behavior into several smaller classes..



public class Main {
    public static void main(String[] args) {
        PizzaComponent BasicPizza = new BasicPizza();
        PizzaComponent BeafPizza = new BeafPizza(BasicPizza);

        System.out.println(BeafPizza.Description());


    }
}
