package core.varargs;

public class Main {
    public static void main(String[] args) {
        printAll("a", 1, "b", 2.0);
    }

    static void printAll(Object... objects) {
        for (Object obj : objects) {
            System.out.println(obj);
        }
    }
}
