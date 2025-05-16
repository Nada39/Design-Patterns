package BehavioralDesignPattern.Momento;

public class Main {
    
    public static void main(String[] args) {
        Game game = new Game("Abdo", 0);
        CareTaker careTaker = new CareTaker();

        careTaker.save(game);
        System.out.println("playerScore: " + game.getPlayerScore());


        game.setPlayerScore(game.getPlayerScore()+20) ;
        // it still not saved
        System.out.println("playerScore: " + game.getPlayerScore());

        careTaker.save(game);
        // playerscore -> 20
        System.out.println("playerScore: " + game.getPlayerScore());

        //if rollback
        careTaker.rollBack(game);

        //player score -> 0
        System.out.println("playerScore: " + game.getPlayerScore());
    }
}
