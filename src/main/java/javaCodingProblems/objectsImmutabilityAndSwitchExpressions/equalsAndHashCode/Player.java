package javaCodingProblems.objectsImmutabilityAndSwitchExpressions.equalsAndHashCode;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Player {

    private int id;
    private String name;

    public Player(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Player other = (Player) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.id;
        hash = 79 * hash + Objects.hashCode(this.name);
        return hash;
    }

    public static void main(String[] args) {
        Player p1 = new Player(1, "Vl");
        Player p2 = new Player(1, "Vl");
        System.out.println(p1.equals(p2));

        Set<Player> players = new HashSet<>();
        players.add(p1);
        players.add(p2);
        System.out.println("p1 hash code: " + p1.hashCode());
        System.out.println("p2 hash code: " + p2.hashCode());
        System.out.println("Set size: " + players.size());
        System.out.println("Set contains Vl: "
                + players.contains(new Player(1, "Vl")));
    }
}
