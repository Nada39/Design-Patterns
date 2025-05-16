package BehavioralDesignPattern.Momento;


//Originator
public class Game {
    
    private String playerName;
    private int playerScore;

    public Game(String playerName , int playerScore)
    {
        this.playerName = playerName;
        this.playerScore = playerScore;
    }

    public CheckPoint save()
    {
        return new CheckPoint(playerName, playerScore);
    }

    public void rollBack(CheckPoint revCheckPoint)
    {
        this.playerName = revCheckPoint.getPlayerName();
        this.playerScore = revCheckPoint.getPlayerScore();

    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void setPlayerScore(int playerScore) {
        this.playerScore = playerScore;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getPlayerScore() {
        return playerScore;
    }
}
