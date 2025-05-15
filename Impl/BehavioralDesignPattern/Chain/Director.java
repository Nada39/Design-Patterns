package BehavioralDesignPattern.Chain;

public class Director extends Handler{

    @Override
    public void handleRequest(Request request) {
        if(request.requestType == RequestType.Level3)
        {
            System.out.println("Director");
        }
        else
        {
            handler.handleRequest(request);;
        }
        
    }
    
}
