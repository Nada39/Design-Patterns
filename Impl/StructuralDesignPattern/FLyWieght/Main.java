package StructuralDesignPattern.FLyWieght;

public class Main {
    public static void main(String[] args) {
        Player player1 = PlayerFactory.getPlayer("Red");
        player1.render();

        Player player2 = PlayerFactory.getPlayer("Blue"); 
        player2.render();

        Player player3 = PlayerFactory.getPlayer("Blue"); // same object
        player3.render();
    }
}
