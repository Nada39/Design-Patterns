package BehavioralDesignPattern.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Iterable Interface: It allows objects to be iterated over sequentially, making it possible to use enhanced for-loops (for-each loops)

public class PersonIterator implements Iterable<Person> {
    List<Person> persons ;

    public PersonIterator()
    {
        this.persons= new ArrayList<Person>();
    }
    
    public void add(Person person)
    {
        this.persons.add(person);
    }

    @Override
    public Iterator<Person> iterator() {


            return  new Iterator<Person>() {

                int index =0 ;
                @Override
                public boolean hasNext() {
                    return index < persons.size();
                }

                @Override
                public Person next() {
                    if(hasNext())
                    {
                        Person p = persons.get(index);
                        index++; 
                        return p;

                    }
                    return null;
                }
                
            };
    }

    
}
