package core.classDeclaration.generics;

public class Vector<T> {
    public static void main(String[] args) {
        Vector<String> x = new Vector<>();
        Vector<Integer> y = new Vector<>();
        boolean b = x.getClass().equals(y.getClass());
        System.out.println(b);
    }
}
