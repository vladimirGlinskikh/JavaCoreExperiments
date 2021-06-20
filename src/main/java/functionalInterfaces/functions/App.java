package functionalInterfaces.functions;

import java.util.function.Function;

public class App {
    public static void main(String[] args) {
        Function<String, Integer> function = Integer::parseInt;
        Integer i = function.apply("101");
        System.out.println(i);

        Function<String, Boolean> fsb = Boolean::parseBoolean;
        System.out.println(fsb.andThen(x -> x ? 1 : 0).apply("true"));
    }
}
