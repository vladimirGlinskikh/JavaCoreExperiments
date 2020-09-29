package core.methodDeclarations.nonAbstractOvveriding;

public abstract class Point {
    int x, y;

    public abstract String toString();

    protected String objString() {
        return super.toString();
    }
}
