package BehavioralDesignPattern.Momento;


// Momento
public class CheckPoint {
    

    private String playerName;
    private int playerScore;

    public CheckPoint(String playerName , int playerScore)
    {
        this.playerName = playerName;
        this.playerScore = playerScore;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getPlayerScore() {
        return playerScore;
    }

}
