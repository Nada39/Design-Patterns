package AbstractFactory;


// SOLID principles:
// Single resposibility
// Open/Closed: New Store then new Factory then new Ingrediants (Pros and Cons)
// Dependency Inversion: Eliminates direct dependencies on concrete classes.

// Not focuse in the order

public class Main {
    public static void main(String[] args) {
        PizzaIngredientFactory PizzaIngredientFactory = new ChigacoPizzaIngredientFactory();
        PizzaIngredientFactory.createDough(); // will create Chigaco Dough
        PizzaIngredientFactory.createSauce(); // will create Chigaco Sauce
        PizzaIngredientFactory.createCheese(); // will create Chigaco Cheese
        

        PizzaIngredientFactory = new NYPizzaIngredientFactory();
        PizzaIngredientFactory.createDough(); // will create NY Dough
        PizzaIngredientFactory.createSauce(); // will create NY Sauce
        PizzaIngredientFactory.createCheese(); // will create NY Cheese
        
    }
}
