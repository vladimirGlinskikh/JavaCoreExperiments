package OCP.practiceTest1.test5;

public class Test {
    public static void main(String[] args) {
        String javaWorld = "JavaWorld";
        String java = "Java";
        String world = "World";
        java += world;
        System.out.println(java == javaWorld);
    }
}

  /*  What will be the result of compiling and executing Test class?
        A. JavaWorld
        B. Java
        C. World
        D. true
        E. false
  */

/*
        Reason :
        Please note that Strings computed by concatenation at compile time
        are referred by String Pool. Compile time String concatenation
        happens when both of the operands are compile time constants, such
        as literal, final variable etc. This means the result of constant
        expression is calculated at compile time and later referred by String
        Pool.

        Where as Strings computed by concatenation at run time (if the
        resultant expression is not constant expression) are newly created
        and therefore distinct.

        java += world;
        is same as
        java = java + world;
        and
        java + world
        is not a constant expression and hence is calculated at runtime and
        returns a non pool String object "JavaWorld", which is referred by
        variable 'java'.

        On the other hand, variable 'javaworld' refers to String Pool object
        "JavaWorld". As both the variables 'java' and 'javaworld' refer to
        different String objects, hence `java == javaworld` returns false.
*/
