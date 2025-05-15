package BehavioralDesignPattern.Chain;

public class CEO extends Handler{
    @Override
    public void handleRequest(Request request) {
        if(request.requestType == RequestType.Level3)
        {
            System.out.println("CEO");
        }
        else
        {
            handler.handleRequest(request);;
        }
        
    }    
}
