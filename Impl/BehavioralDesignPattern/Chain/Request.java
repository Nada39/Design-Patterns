package BehavioralDesignPattern.Chain;

public class Request {
    int amount;
    RequestType requestType;

    public Request(int amount  , RequestType requestType)
    {
        this.amount = amount;
        this.requestType = requestType;
    }
}
