package BehavioralDesignPattern.Observer;

public class Player extends Observer{

    private String name;
    private Subject subject;


    public Player(String name , Subject subject)
    {
        this.name = name;
        this.subject = subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    // public void wantsToPlay(Observer observer)
    // {
    //     subject.join(observer);
    // }

    public void makeanAction()
    {
        subject.setState("The action");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void update() {
        boolean found = false;
     for (Observer observers : subject.Observers) {
            if(this.equals(observers))
            {
                found = true;
            }
        } 

        if(found)
        {
            System.out.println(name + " reciept");
        }
        else
        {
            System.out.println("no longer plays");
        }
    }



}
