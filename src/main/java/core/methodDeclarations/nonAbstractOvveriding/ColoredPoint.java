package core.methodDeclarations.nonAbstractOvveriding;

public class ColoredPoint extends Point {
    int color = 1;

    @Override
    public String toString() {
//        return super.toString() + ": color " + color;//error
        return objString() + ": color " + color;
    }

    public static void main(String[] args) {
        System.out.println(new ColoredPoint().toString());
    }
}
