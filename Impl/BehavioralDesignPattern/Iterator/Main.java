package BehavioralDesignPattern.Iterator;

public class Main {
    public static void main(String[] args) {
        PersonIterator personIterator = new PersonIterator();
        personIterator.add(new Person("Nada"));
        personIterator.add(new Person("Samaa"));
        personIterator.add(new Person("Hamza"));
        personIterator.add(new Person("Noha"));


        personIterator.forEach(p->System.out.println(((Person) p).getName()));

    }
}
