package javaCodingProblems.objectsImmutabilityAndSwitchExpressions.equalsAndHashCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
    @Test
    public void equalsTwoClassesFalse() {
        Player p1 = new Player(1, "Vladimir");
        Player p2 = new Player(1, "Vladimir");
        assertNotEquals(p2, p1);
    }

    @Test
    public void equalsTwoClassesTrue() {
        Player p1 = new Player(1, "Vladimir");
        Player p2 = p1;
        assertEquals(p2, p1);
    }

    @Test
    public void equalsHashCodeFalse(){
        Player p1 = new Player(1, "Vladimir");
        Player p2 = new Player(1, "Vladimir");
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        assertNotEquals(p2.hashCode(), p1.hashCode());
    }

    @Test
    public void equalsHashCodeTrue(){
        Player p1 = new Player(1, "Vladimir");
        Player p2 = p1;
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        assertEquals(p2.hashCode(), p1.hashCode());
    }
}