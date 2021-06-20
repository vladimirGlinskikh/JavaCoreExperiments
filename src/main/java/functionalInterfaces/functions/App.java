package functionalInterfaces.functions;

import java.util.function.*;

public class App {
    public static void main(String[] args) {
        Function<String, Integer> function = Integer::parseInt;
        Integer i = function.apply("101");

        Function<Boolean, Integer> fbi = x -> x ? 1 : 0;
        Function<String, Boolean> fsb = Boolean::parseBoolean;
        Function<String, String> fss = Function.identity();

        IntFunction<String> fi = x -> (Integer.valueOf(x)).toString();
        DoubleFunction<Boolean> fd = x -> x > 5.0;
        LongFunction<Integer> fl = x -> (int) x;

        ToIntFunction<String> ti = Integer::parseInt;
        ToLongFunction<Double> tl = Double::longValue;
        ToDoubleFunction<Integer> td = x -> (Integer.valueOf(x).doubleValue());

        System.out.println(i);
        System.out.println("-------------------------");
        System.out.println(fsb.andThen(x -> x ? 1 : 0).apply("true"));
        System.out.println(fbi.compose(fsb).apply("true"));
        System.out.println(fss.apply("Hello Function interfaces"));
        System.out.println("------------------------");
        System.out.println(fi.apply(5));
        System.out.println(fd.apply(5.9));
        System.out.println(fl.apply(20L));
        System.out.println("--------------------------");
        System.out.println(ti.applyAsInt("5"));
        System.out.println(tl.applyAsLong(5.1));
        System.out.println(td.applyAsDouble(7));
    }
}
