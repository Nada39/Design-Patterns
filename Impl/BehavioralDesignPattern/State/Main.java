package BehavioralDesignPattern.State;


// SOLID principles:
//Liskov Substitution: States can replace each other.
//Open/Closed: New states can be added.

public class Main {
    public static void main(String[] args) {
        // there is many books implement booke and set the next for each one 


        Worker worker = new Worker();
        Book1 book1 = new Book1();
        worker.setCurrentBook(book1);


        // it should be book2 but it didn't implement:)
        worker.getNextBook();

        
    }
}
