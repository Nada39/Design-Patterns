package Builder;

public class HouseBuilder {
    int walls;
    int doors;
    int rooms;
    int Windows;
    boolean roof;
    boolean garage;

    public HouseBuilder setWalls(int walls) {
        this.walls = walls;
        return this;
    }

    public HouseBuilder setDoors(int doors) {
        this.doors = doors;
        return this;
    }
    
   public HouseBuilder setRooms(int rooms) {
       this.rooms = rooms;
       return this;
   }

   public HouseBuilder setRoof(boolean roof) {
       this.roof = roof;
       return this;
   }


   public HouseBuilder setGarage(boolean garage) {
       this.garage = garage;
       return this;
   }

   public House build()
   {
        return new House(this);
   }
}
