package core.classDeclaration.inner;

public class Outer1 {
    int i = 100;

    static void classMethod() {
        final int l = 200;
        class LocalInStaticContext {
//            int k = i; // Compile time error
            int m = l; // OK
        }
    }

    void foo() {
        class Local {
            int j = i;
        }
    }
}
