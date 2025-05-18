package BehavioralDesignPattern.Observer;

// SOLID principles:
// Open/Closed: New observers can be added without modifying subjects.
// Dependency Inversion: Observers depend on abstractions.

// We could add mediator to manage the communication between observers and observable(Subject)

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
