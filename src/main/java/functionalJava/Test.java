package functionalJava;

public class Test {
    public static void main(String[] args) {
        System.out.println(add(2, 3));
        System.out.println(div(2, 0));
    }

    public static int add(int a, int b) {
        while (b > 0) {
            a++;
            b--;
        }
        return a;
    }

    public static int div(int a, int b) {
//        return a / b;
        return (int) (a / (float) b);
    }
}
