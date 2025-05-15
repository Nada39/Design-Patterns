package BehavioralDesignPattern.Chain;

public abstract class Handler {
    public Handler handler = null;

    public void setSuccessor(Handler handler) { 
        this.handler = handler;
    }

    public abstract void handleRequest(Request request);
}
