package BehavioralDesignPattern.State;


//Context
public class Worker {

    // have state object 
    //start with book1 
    Book currentBook = new Book1();
 
    public void setCurrentBook(Book currentBook) {
        this.currentBook = currentBook;
    }

    public void getNextBook()
    {
        currentBook.nextBook();
        // System.out.println("getting " + currentBook);
    }
    
}
