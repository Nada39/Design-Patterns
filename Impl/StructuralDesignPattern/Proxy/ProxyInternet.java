package StructuralDesignPattern.Proxy;

public class ProxyInternet implements Internet {

    @Override
    public void grantInternetAccess(Employee employee) {
        if(employee.getSecurityLevel() > 5)
        {
           new RealInternetConnection().grantInternetAccess(employee);
        }
        else
        {
            System.out.println("Permission Denaied");
        }
    }
    
}
