package StructuralDesignPattern.Proxy;

public class RealInternetConnection implements Internet{

    @Override
    public void grantInternetAccess(Employee employee) {
        System.out.println("Granted Internet Persmission for " + employee.getName());
    }
    
    
}
