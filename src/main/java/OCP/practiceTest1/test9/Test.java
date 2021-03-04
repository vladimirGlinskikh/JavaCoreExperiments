package OCP.practiceTest1.test9;

import core.filtering.predicate.Predicate;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> words = List.of("A", "an", "the",
                "when", "what", "Where", "whether");
        processStringArray(words, (var p) -> p.length() < 100);
    }

    private static void processStringArray(List<String> list, Predicate<String> predicate) {
        for (String str : list) {
            if (predicate.test(str)) {
                System.out.println(str);
            }
        }
    }
}

        /*Which of the following options can replace *//*INSERT*//* such
        that on executing Test class all the list elements are displayed in
        the output?
        Select ALL that apply.*/

        /*A. p -> true
        B. p -> !!!! true
        C. p -> !! false
        D. p -> p.length() >= 1
        E. p -> p.length() < 7
        F. ( var p) -> p.length() < 100
        G. var p -> p.length() > 0*/


        /*Reason :
        Static List.of() overloaded methods were added in Java 9 and thesereturn an unmodifiable list containing passed elements.

        Let's check all the options one by one:
        p -> true ✓ Means test method returns true for the passed String. It
        will print all the elements of the List .

        p -> !!!!true ✓ !!!!true => !!!false => !!true => !false => true, means
        test method returns true for the passed String. It will print all the
        elements of the List.

        p -> !!false ✗ !!false => !true => false, means test method returns
        false for the passed String. It will not print even a single element of
        the list.

        p -> p.length() >= 1 ✓ Means test method returns true if passed
        String's length is greater than or equal to 1 and this is true for all the
        list elements.

        p -> p.length() < 7 ✗ Means test method returns true if passed
        String's length is less than 7 and this is not true for "whether".
        "whether" will not be displayed in the output.

        Local variable Type inference was added in JDK 10.
        Reserved type name var is allowed in JDK 10 onwards for local
        variable declarations with initializers, enhanced for-loop indexes,
        and index variables declared in traditional for loops. For example,
        var x = "Java"; //x infers to String
        var m = 10; //m infers to int

        (var p) -> p.length() < 100 ✓ Type of p is inferred from the target
        type, which is Predicate<String>. This means 'p' is of String type.
        var p -> p.length() > 0 ✗ Round brackets or parenthesis are missing
        around 'var p'. This causes compilation error.*/