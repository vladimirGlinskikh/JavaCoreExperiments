package core.scope.names;

public class Test {
    void f1(int i) {
    }

    void f2(int i) {
    }

    void f3(int i) {
    }

    void f4(int i){}

    void m() {
        new Super() {
            {
                f1(0);// OK
//                f2(0);//compile time error
//                f3(0);// compile time error
                f4(4);// OK
            }
        };
    }
}
