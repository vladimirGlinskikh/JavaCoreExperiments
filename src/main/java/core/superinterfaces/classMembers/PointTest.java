package core.superinterfaces.classMembers;

public class PointTest extends Point1 {
    int z;

    void move(int dx, int dy, int dz) {
        super.move(dx, dy);
        z += dz;
//        totalMoves++; // error
    }
}
