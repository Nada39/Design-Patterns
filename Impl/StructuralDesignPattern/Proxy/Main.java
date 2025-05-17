package StructuralDesignPattern.Proxy;

// SOLID principles:
//Single Responsibility: Separates access control logic from core functionality.
//Open/Closed: You can introduce new proxies without changing the service or clients.
//Dependency Inversion: Allows high-level components to depend on abstractions instead of direct implementations.


//The response from the service might get delayed.
public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        ProxyInternet access = new ProxyInternet();

        employee.setSecurityLevel(4);
        access.grantInternetAccess(employee);

        employee.setSecurityLevel(7);
        access.grantInternetAccess(employee);
    }
}
