package functionalJava;

public class Test {
    public static void main(String[] args) {
        System.out.println(add(2, 3));
    }

    public static int add(int a, int b) {
        while (b > 0) {
            a++;
            b--;
        }
        return a;
    }
}
