package sololearn.shapes;

public class Square extends Shape {

    public Square(int width) {
        super(width);
    }

    @Override
    void area() {
        System.out.printf("%.0f\n", Math.pow(width, 2));
    }
}
