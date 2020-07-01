package core.objects.creation;

public class Point {
    int x, y;

    public Point() {
        System.out.println("default constructor");
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    static Point origin = new Point(0, 0);

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
