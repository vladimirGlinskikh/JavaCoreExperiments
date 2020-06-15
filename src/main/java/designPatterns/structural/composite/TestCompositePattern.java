package designPatterns.structural.composite;

public class TestCompositePattern {
    public static void main(String[] args) {
        Shape triangle = new Triangle();
        Shape triangle1 = new Triangle();
        Shape circle = new Circle();

        Drawing drawing = new Drawing();
        drawing.add(triangle);
        drawing.add(triangle1);
        drawing.add(circle);

        drawing.draw("Green");

        System.out.println("--------------");
        drawing.clear();
        System.out.println("--------------");

        drawing.add(triangle);
        drawing.add(circle);
        drawing.draw("Yellow");
    }
}
