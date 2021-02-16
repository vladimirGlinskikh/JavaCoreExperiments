package sololearn.shapes;

public abstract class Shape {
    int width;
    abstract void area();

    public Shape(int width) {
        this.width = width;
    }
}
