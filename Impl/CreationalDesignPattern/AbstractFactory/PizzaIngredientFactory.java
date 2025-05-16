package AbstractFactory;

// its better to be singleton
public interface PizzaIngredientFactory {
    // abstract factory 
    public abstract Dough createDough(); // factory method subclasses have actual impl
    public abstract Sauce createSauce(); // factory method
    public abstract Cheese createCheese(); // factory method
    
} 