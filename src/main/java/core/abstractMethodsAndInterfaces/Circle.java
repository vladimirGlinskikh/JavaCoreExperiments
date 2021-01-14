package core.abstractMethodsAndInterfaces;

public class Circle implements Figure {
    private int xCoord, yCoord, radius;

    @Override
    public void draw(int x, int y) {
        xCoord = x;
        yCoord = y;
    }

    @Override
    public void move(int x, int y) {
        xCoord = x;
        yCoord = y;
    }
}
