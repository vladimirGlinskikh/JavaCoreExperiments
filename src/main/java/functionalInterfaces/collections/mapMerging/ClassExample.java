package functionalInterfaces.collections.mapMerging;

public class ClassExample {
    int i1;
    int i2;
    String s;

    public ClassExample(int i1, int i2, String s) {
        this.i1 = i1;
        this.i2 = i2;
        this.s = s;
    }

    @Override
    public String toString() {
        return i1 + " " + i2 + " " + s;
    }
}
