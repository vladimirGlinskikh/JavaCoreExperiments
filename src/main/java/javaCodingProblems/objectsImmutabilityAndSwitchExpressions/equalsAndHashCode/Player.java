package javaCodingProblems.objectsImmutabilityAndSwitchExpressions.equalsAndHashCode;

import java.util.Objects;

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

    public static void main(String[] args) {
        Player p1 = new Player(1, "Vl");
        Player p2 = new Player(1, "Vl");
        System.out.println(p1.equals(p2));
    }
}
