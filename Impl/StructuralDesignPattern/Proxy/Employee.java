package StructuralDesignPattern.Proxy;

public class Employee {
    private String name ;
    private int securityLevel;

    public void setName(String name) {
        this.name = name;
    }

    public void setSecurityLevel(int securityLevel) {
        this.securityLevel = securityLevel;
    }

    public String getName() {
        return name;
    }

    public int getSecurityLevel() {
        return securityLevel;
    }
}
