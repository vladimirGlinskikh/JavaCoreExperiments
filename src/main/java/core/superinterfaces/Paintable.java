package core.superinterfaces;

public interface Paintable extends Colorable {
    void setFinish(Finish finish);

    Finish getFinish();
}
