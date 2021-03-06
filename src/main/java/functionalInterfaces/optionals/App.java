package functionalInterfaces.optionals;

import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.function.Supplier;

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

//        Optional<String> optional = Optional.ofNullable(null);
//        Optional<String> optional1 = Optional.ofNullable("one");
//        try {
//            optional.get();
//        } catch (NoSuchElementException e) {
//            System.out.println("NoSuchElementException");
//        }

//        if (optional.isPresent())
//            System.out.println(optional.get());
//        if (optional1.isPresent())
//            System.out.println(optional1.get());
//        else System.out.println("optional1 is null");
//
//        if (!optional.isEmpty())
//            System.out.println(optional.get());
//        else System.out.println("optional is null");

//        String t = null, u = "Java";
//        String s = t;
//        if (t == null)
//            s = u;
//        System.out.println(s);
//        String s = Optional.ofNullable(t).orElse(u);
//        System.out.println(s);

//        try {
//            String s = null;
//            String opt = Optional.ofNullable(s)
//                    .orElseThrow(/*() -> new Exception("Null Optional")*/);
//        } catch (Exception e) {
//            System.err.println(e.getMessage());
//        }

//        Supplier<Optional<String>> supplier = () -> {
//            System.out.println("Enter a string:");
//            return Optional.of((new Scanner(System.in)).nextLine());
//        };
//
//        String s = null;
//        Optional<String> os = Optional.ofNullable(s).or(supplier);
//        if (os.isPresent())
//            System.out.println(os.get());

//        String s = null;
//        Optional.ofNullable(s)
//                .or(supplier)
//                .ifPresent(System.out::println);

//        String t = null;
//        Optional.ofNullable(t)
//                .filter(x -> x.length() > 2);
//        Optional.of("Java")
//                .filter(x -> x.charAt(0) == 'J')
//                .filter(x -> x.length() > 2)
//                .filter(x -> x.charAt(1) == 'a')
//                .ifPresent(System.out::println);

//        Predicate<String> predicate = x -> x.charAt(0) == 'i';
//        Optional.of("Java")
//                .filter(predicate.or(x -> x.charAt(0) == 'J'))
//                .ifPresent(System.out::println);

        Optional.of("5")
                .map(x -> Integer.parseInt(x))
                .filter(x -> x > 3)
                .filter(x -> (x % 2) != 0)
                .ifPresent(x -> System.out.println(x));

        Optional<Integer> optional = Optional.of(3);
        optional.ifPresent(x -> ++x);
        optional.ifPresent(x -> System.out.println(x));

        Optional.of(2)
                .map(x -> ++x)
                .ifPresent(x -> System.out.println(x));

        Optional.of("5")
                .flatMap(x -> Optional.of(Integer.parseInt(x)))
                .ifPresent(x -> System.out.println(x));

        Optional.of(new Resource())
                .filter(x -> x.count > 0)
                .map(x -> new Resource())
                .filter(x -> x.count > 0)
                .map(x -> new Resource())
                .filter(x -> x.count > 0)
                .map(x -> new Resource());
    }
}
