package BehavioralDesignPattern.Chain;

public class VicePresident extends Handler {

    @Override
    public void handleRequest(Request request) {
        if(request.requestType == RequestType.Level2)
        {
            System.out.println("VicePresident");
        }
        else
        {
            handler.handleRequest(request);;
        }
        
    }
    
}
