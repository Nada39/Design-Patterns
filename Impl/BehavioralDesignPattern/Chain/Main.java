package BehavioralDesignPattern.Chain;

// SOLID priciples:
//Single Responsibility: Each handler has a specific job.
//Open/Closed: New handlers can be added without modifying existing ones.

// you can control the order

// the perfocmance become slow if the chain is loooong

public class Main {
    public static void main(String[] args) {
        Request requestToCEO = new Request(1000, RequestType.Level1);
        Request requestToVP = new Request(1000, RequestType.Level2);
        Request requestToDirector = new Request(1000, RequestType.Level3);

        Director director = new Director();
        VicePresident vicePresident = new VicePresident();
        CEO ceo = new CEO();

        director.handleRequest(requestToDirector);

    
        director.handleRequest(requestToCEO);
        director.handleRequest(requestToVP);

        vicePresident.handleRequest(requestToVP);

        vicePresident.handleRequest(requestToCEO);

        ceo.handleRequest(requestToCEO);

    }
}


