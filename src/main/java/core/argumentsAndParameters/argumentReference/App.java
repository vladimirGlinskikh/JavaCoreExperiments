package core.argumentsAndParameters.argumentReference;

public class App {
    public static void main(String[] args) {
        Test ob = new Test();
        int a = 15, b = 20;
        System.out.println("a and b before the call: " + a + " " + b);
        ob.meth(a, b);
        System.out.println("a and b after the call: " + a + " " + b);
    }
}
