package OCP.practiceTest1.test4;

public class Test {
    public static void main(String[] args) {
        Operationable operation;
        Stringonable string;
        operation = (x, y) -> x + y;
        string = (a, b) -> a + b;
        int result = operation.calculate(20, 3);
        String str = string.text("a", "b");
        System.out.println(result);
        System.out.println(str);
    }
}


    /*What is the purpose of below lambda expression?
        (x, y) -> x + y;

        A. It accepts two int arguments, adds them and returns the int value
        B. It accepts two String arguments, concatenates them and returns
        the String instance
        C. It accepts a String and an int arguments, concatenates them and
        returns the String instance
        D. Not possible to define the purpose*/


        /*Reason :
        Lambda expression doesn't work without target type and target type
        must be a functional interface, so in this case as the given lambda
        expression is not assigned to any target type, hence its purpose is not
        clear. In fact, given lambda expression causes compilation error
        without its target type.*/