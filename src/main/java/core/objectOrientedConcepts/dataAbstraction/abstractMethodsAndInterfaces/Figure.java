package core.objectOrientedConcepts.dataAbstraction.abstractMethodsAndInterfaces;

public interface Figure {
    int MAX_X_COORD = 1024;
    int MAX_Y_COORD = 768;

    void draw(int x, int y);

    void move(int x, int y);
}
