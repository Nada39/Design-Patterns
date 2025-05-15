package BehavioralDesignPattern.Chain;

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

        ceo.handleRequest(requestToCEO);
        vicePresident.handleRequest(requestToVP);
        vicePresident.handleRequest(requestToCEO);
    }
}


