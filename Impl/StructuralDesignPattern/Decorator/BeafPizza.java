package StructuralDesignPattern.Decorator;

public class BeafPizza extends BasicPizza{
    PizzaComponent pizzaComponent; 

    public BeafPizza(PizzaComponent pizzaComponent)
    {
        this.pizzaComponent = pizzaComponent;
    }

    @Override
    public int cost() {
        return pizzaComponent.cost() + 10;
    }

    @Override
    public String Description() {
        return pizzaComponent.Description()+ " Beaf";
    }
    
}
