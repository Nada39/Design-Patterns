package StructuralDesignPattern.FLyWieght;

import java.util.HashMap;
import java.util.Map;

public class PlayerFactory { 
    static Map players = new HashMap<String , Player>();

    public static Player getPlayer(String type)   // Factory Method --> create object if needed
    {
        if(players.containsKey(type)) // if exists
        {
            return (Player)players.get(type);
        }
        else
        {
            if(type.equals("Red"))
            {
                Player p = new RedTeamPlayer();
                players.put(type, p);
                return p;
            }
            else
            {
                Player p = new BlueTeamPlayer();
                players.put(type, p);
                return p;
            }
        }
    }
}
