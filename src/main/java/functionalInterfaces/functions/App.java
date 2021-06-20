package functionalInterfaces.functions;

import java.util.function.Function;

public class App {
    public static void main(String[] args) {
        Function<String, Integer> function = Integer::parseInt;
        Integer i = function.apply("101");
        System.out.println(i);

        Function<Boolean, Integer> fbi = x -> x ? 1 : 0;
        Function<String, Boolean> fsb = Boolean::parseBoolean;
        Function<String, String> fss = Function.identity();
//        System.out.println(fsb.andThen(x -> x ? 1 : 0).apply("true"));
        System.out.println(fbi.compose(fsb).apply("true"));
        System.out.println(fss.apply("Hello Function interfaces"));
    }
}
