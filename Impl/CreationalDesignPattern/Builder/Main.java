package Builder;

public class Main {
    public static void main(String[] args) {
        
        House house = new HouseBuilder().setDoors(2).setRooms(5).setGarage(true).build();
        System.out.println(house.getDoors() + " " + house.getRooms() + " " + house.getRoof());
    }
}
