package OCP.practiceTest1.test1;

import java.io.FileNotFoundException;

public class Test {
    public static void main(String[] args) {
        Base b = new Derived();
        try {
             /*
            As calling code doesn't handle IOException or its supertype, so
            b.print(); causes compilation error.
             */
//            b.print();// compilation error
//        } catch (FileNotFoundException e) {
            System.out.print("AWE");
        } finally {
            System.out.print("SOME");
        }
    }
}
