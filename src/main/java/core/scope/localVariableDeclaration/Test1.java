package core.scope.localVariableDeclaration;

public class Test1 {
    static int x;
    /*
    The following program causes a compile-time error because the initialization of local
    variable x is within the scope of the declaration of local variable x , but the local variable
    x does not yet have a value and cannot be used. The field x has a value of 0 (assigned
    when Test1 was initialized) but is a red herring since it is shadowed (§6.4.1) by the local
    variable x .
     */
    public static void main(String[] args) {
        //int x = x;
    }
}
