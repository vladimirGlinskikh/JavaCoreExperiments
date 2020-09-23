package core.superinterfaces.classMembers;

public class Point1 {
    int x, y;
    private static int totalMoves;

    void move(int dx, int dy) {
        x += dx;
        y += dy;
        totalMoves++;
    }

    void printMoves() {
        System.out.println(totalMoves);
    }
}
