package functionalInterfaces.optionals;

import java.util.NoSuchElementException;
import java.util.Optional;

public class App {
    public static void main(String[] args) {
//        try {
//            Optional<String> optional1 = Optional.of(null);
//        } catch (NullPointerException e) {
//            System.out.println("NullPointerException");
//        }
//        Optional<String> optional2 = Optional.of("Hello Optional interface");
//        System.out.println(optional2);
//
//        Optional<String> optional3 = Optional.ofNullable(null);
//        System.out.println(optional3);
//        Optional<String> optional4 = Optional.ofNullable("Hello");
//        System.out.println(optional4);
//        Optional<String> optional5 = Optional.empty();
//        System.out.println(optional5);
//        System.out.println("-----------------------");
//
//        Optional<String> imNull = Optional.ofNullable(null);
//        if (imNull.isEmpty())
//            System.out.println("Empty");

        Optional<String> optional = Optional.ofNullable(null);
        Optional<String> optional1 = Optional.ofNullable("one");
//        try {
//            optional.get();
//        } catch (NoSuchElementException e) {
//            System.out.println("NoSuchElementException");
//        }

        if (optional.isPresent())
            System.out.println(optional.get());
        if (optional1.isPresent())
            System.out.println(optional1.get());
        else System.out.println("optional1 is null");

        if (!optional.isEmpty())
            System.out.println(optional.get());
        else System.out.println("optional is null");
    }
}
