package AbstractFactory;

public interface PizzaIngredientFactory {
    // abstract factory 
    public Dough createDough(); // factory method subclasses have actual impl
    public Sauce createSauce(); // factory method
    public Cheese createCheese(); // factory method
    
} 