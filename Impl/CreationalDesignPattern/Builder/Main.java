package Builder;

// SOLID principles
// Single resposibility: Separates construction logic from object representation
// Open/Closed: Allows additional configurations without modifying existing builders
// Dependency Inversion: provide interfaces


public class Main {
    public static void main(String[] args) {
        
        House house = new HouseBuilder().setDoors(2).setRooms(5).setGarage(true).build();
        System.out.println(house.getDoors() + " " + house.getRooms() + " " + house.getRoof());
    }
}
