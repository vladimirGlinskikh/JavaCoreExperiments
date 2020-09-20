package core.superinterfaces;

public class PaintedPoint extends ColoredPoint implements Paintable {
    Finish finish;

    @Override
    public void setFinish(Finish finish) {
        this.finish = finish;
    }

    @Override
    public Finish getFinish() {
        return finish;
    }
}
