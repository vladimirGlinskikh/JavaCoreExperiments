package sololearn.bowling;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Bowling {
    HashMap<String, Integer> players;

    Bowling() {
        players = new HashMap<>();
    }

    public void addPlayer(String name, int p) {
        players.put(name, p);
    }

    public void getWinner() {
        String key = Collections.max(players.entrySet(),
                Map.Entry.comparingByValue()).getKey();
        System.out.println(key);
    }
}
