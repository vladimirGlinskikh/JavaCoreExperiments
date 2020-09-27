package core.fields.volatileTest;

public class Test {
    static volatile int i = 0, j = 0;

    static /*synchronized*/ void one() {
        i++;
        j++;
    }

    static /*synchronized*/ void two() {
        System.out.println("i=" + i + " j=" + j);
    }

    public static void main(String[] args) {
        new Test();
        one();
        two();
    }
}
