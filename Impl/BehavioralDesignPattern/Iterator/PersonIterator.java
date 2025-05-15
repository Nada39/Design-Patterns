package BehavioralDesignPattern.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PersonIterator implements Iterable {
    List persons ;

    public PersonIterator()
    {
        this.persons= new ArrayList<Person>();
    }
    
    public void add(Person person)
    {
        this.persons.add(person);
    }

    @Override
    public Iterator iterator() {


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
                        return (Person) persons.get(index);
                    }
                    return null;
                }
                
            };
    }

    
}
