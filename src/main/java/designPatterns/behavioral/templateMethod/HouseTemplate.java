package designPatterns.behavioral.templateMethod;

public abstract class HouseTemplate {
    public final void buildHouse() {
        buildFoundation();
        buildPillars();
        buildWalls();
        buildWindows();
        System.out.println("House is built.");
    }

    private void buildWindows() {
        System.out.println("Building Glass windows");
    }

    protected abstract void buildWalls();

    protected abstract void buildPillars();

    private void buildFoundation() {
        System.out.println("Building foundation with cement, iron, rods and sand");
    }
}
