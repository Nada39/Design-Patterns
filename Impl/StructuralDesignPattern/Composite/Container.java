package StructuralDesignPattern.Composite;

import java.util.Vector;

public class Container implements Graphic{
    String name = "Container";
    Vector<Graphic> children; 


    @Override
    public String getName() {
        return name;
    }

    void add(Graphic child)
    {
        children.add(child);
    }
    
    void printChildren()
    {
        children.forEach(child -> getName());
    }
    
}
