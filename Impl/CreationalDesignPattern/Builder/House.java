package Builder;


// make class immutable
public class House {
    int walls;
    int doors;
    int rooms;
    int Windows;
    boolean roof;
    boolean garage;

    House(HouseBuilder builder)
    {
        this.walls = builder.walls;
        this.doors = builder.doors;
        this.rooms = builder.rooms;
        this.Windows = builder.Windows;
        this.roof = builder.roof;
        this.garage = builder.garage;
    }

    public int getDoors() {
        return doors;
    }

    public int getRooms() {
        return rooms;
    }

    public int getWalls() {
        return walls;
    }

    public int getWindows() {
        return Windows;
    }

    public boolean getRoof() {
        return roof;
    }

    public boolean getGarage() {
        return garage;
    }
    
}
