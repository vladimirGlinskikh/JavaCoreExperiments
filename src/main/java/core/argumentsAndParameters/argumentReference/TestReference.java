package core.argumentsAndParameters.argumentReference;

public class TestReference {
    int a, b;

    public TestReference(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void meth(TestReference o) {
        o.a *= 2;
        o.b /= 2;
    }
}
