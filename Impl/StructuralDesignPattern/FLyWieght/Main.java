package StructuralDesignPattern.FLyWieght;

// One Object in memory but we can use it in diffrenet ways

public class Main {
    public static void main(String[] args) {
        // We make objects with identical data, Instead if make new one , we can use old one(stored)

        Player player1 = PlayerFactory.getPlayer("Red");
        System.out.println(player1.hashCode());
        player1.render();

        Player player2 = PlayerFactory.getPlayer("Blue"); 
        System.out.println(player2.hashCode());
        player2.render();

        Player player3 = PlayerFactory.getPlayer("Blue"); // same object
        System.out.println(player3.hashCode()); // same hashCode
        player3.render();
    }
}
