package functionalInterfaces.functions;

import java.util.function.Function;

public class Transformer {
    private static <T, R> R transform(T t, Function<T, R> function) {
        return function.apply(t);
    }

    public static void main(String[] args) {
        Function<String, Integer> fsi = Integer::parseInt;
        Function<Integer, String> fis = x -> Integer.toString(x);

        Integer i = transform("101", fsi);
        String s = transform(201, fis);
        System.out.println(i);
        System.out.println(s);
    }
}
