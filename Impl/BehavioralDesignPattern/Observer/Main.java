package BehavioralDesignPattern.Observer;

public class Main {
    public static void main(String[] args) {
        Joker joker = new Joker();
        
        Player player1 = new Player("Player1" , joker);
        Player player2 = new Player("Player2" , joker);
        Player player3 = new Player("Player3" , joker);
        Player player4 = new Player("Player4" , joker);

        // joker knows who wants to play
        joker.join(player1);
        joker.join(player2);
        joker.join(player3);
        joker.join(player4);

        player2.makeanAction();

        System.out.println(joker.getState());

        player3.makeanAction();

        joker.remove(player4);

        player4.makeanAction();

    }
}
