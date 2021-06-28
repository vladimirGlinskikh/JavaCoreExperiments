package core.argumentsAndParameters.argumentReference;

public class App {
    public static void main(String[] args) {
        TestPrimitive testPrimitive = new TestPrimitive();
        int a = 15, b = 20;
        System.out.println("a and b before the call: " + a + " " + b);
        testPrimitive.meth(a, b);
        System.out.println("a and b after the call: " + a + " " + b);
        System.out.println("-----------------------");

        TestReference testReference = new TestReference(15, 20);
        System.out.println("testReference.a and testReference.b before the call: "
                + testReference.a + " " + testReference.b);
        testReference.meth(testReference);
        System.out.println("testReference.a and testReference.b after the call: "
                + testReference.a + " " + testReference.b);

    }
}
