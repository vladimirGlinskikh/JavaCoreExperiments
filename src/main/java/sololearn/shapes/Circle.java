package sololearn.shapes;

public class Circle extends Shape {
    int width;

    public Circle(int width) {
        this.width = width;
    }

    @Override
    void area() {
        System.out.println(Math.PI * width * width);
    }
}
