package StructuralDesignPattern.Decorator;

public class BasicPizza implements PizzaComponent{

    @Override
    public int cost() {
       return 10;
    }

    @Override
    public String Description() {
        return "Basic";
    }
    
}
