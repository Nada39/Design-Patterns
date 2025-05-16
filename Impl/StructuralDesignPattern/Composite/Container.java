package StructuralDesignPattern.Composite;

import java.util.Vector;

public class Container implements Graphic{
    String name = "Container";
    Vector<Graphic> children = new Vector<>(); 


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
        children.forEach(child -> System.out.println(child.getName()));
    }
    
}
