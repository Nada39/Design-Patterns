package StructuralDesignPattern.Decorator;

public class ChickenPizza extends BasicPizza {
    PizzaComponent pizzaComponent;
    
    public ChickenPizza(PizzaComponent pizzaComponent)
    {
        this.pizzaComponent = pizzaComponent;
    }
    
    @Override
    public int cost() {
        return pizzaComponent.cost() + 5;
    }

    @Override
    public String Description() {
        return pizzaComponent.Description() + "Chicken";
    }
    
}
