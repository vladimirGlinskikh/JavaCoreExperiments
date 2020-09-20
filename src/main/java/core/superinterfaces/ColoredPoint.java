package core.superinterfaces;

public class ColoredPoint extends Point implements Colorable {
    int color;

    @Override
    public void setColor(int color) {
        this.color = color;
    }

    @Override
    public int getColor() {
        return color;
    }
}
