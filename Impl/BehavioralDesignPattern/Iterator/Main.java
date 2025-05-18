package BehavioralDesignPattern.Iterator;


//All iterators must implement the same interface. 
//This makes the client code compatible with any collection type or any traversal algorithm as long as there’s a proper iterator.

// SOLID principles:
// single responsplitiy 
// Open/Closed

public class Main {
    public static void main(String[] args) {
        PersonIterator personIterator = new PersonIterator();
        personIterator.add(new Person("Nada"));
        personIterator.add(new Person("Samaa"));
        personIterator.add(new Person("Hamza"));
        personIterator.add(new Person("Noha"));


        personIterator.forEach(p->System.out.println(p.getName()));

    }
}
