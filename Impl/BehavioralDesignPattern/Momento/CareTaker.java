package BehavioralDesignPattern.Momento;

import java.util.Stack;

public class CareTaker {
    
    Stack<CheckPoint> saves = new Stack<>();

    public void save(Game game)
    {
        saves.push(game.save());
    }

    public void rollBack(Game game)
    {
        saves.pop();
        game.rollBack(saves.peek());
    }
}
