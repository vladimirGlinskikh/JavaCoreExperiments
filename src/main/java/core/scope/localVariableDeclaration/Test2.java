package core.scope.localVariableDeclaration;

public class Test2 {
    static int x;

    public static void main(String[] args) {
        int x = (x = 2) * 2;
        System.out.println(x);
    }
}
