package core.classDeclaration;

public interface Colorable {
    void setColor(int color);

    int setColor(int color, int argument);
}

abstract class Colored implements Colorable {
    public abstract int setColor(int color, int argument);

//    private Colored() {
//    }
}

// we can not extends if constructor of class Colored is private
class Test extends Colored {

    @Override
    public void setColor(int color) {

    }

    @Override
    public int setColor(int color, int argument) {
        return 0;
    }
}
