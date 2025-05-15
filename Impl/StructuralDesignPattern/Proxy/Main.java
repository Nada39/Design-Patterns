package StructuralDesignPattern.Proxy;

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
