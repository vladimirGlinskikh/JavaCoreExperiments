package sololearn.shapes;

public class Circle extends Shape {

    public Circle(int width) {
        super(width);
    }

    @Override
    void area() {
        System.out.println(Math.PI * width * width);
    }
}
