package sololearn.shapes;

public class Square extends Shape {
    int width;

    public Square(int width) {
        this.width = width;
    }

    @Override
    void area() {
        System.out.printf("%.0f\n", Math.pow(width, 2));
    }
}
