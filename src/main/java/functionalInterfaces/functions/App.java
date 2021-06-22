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

        DoubleToIntFunction di = x -> (Double.valueOf(x)).intValue();
        DoubleToLongFunction dl = x -> (Double.valueOf(x)).longValue();
        IntToDoubleFunction id = x -> (Integer.valueOf(x)).doubleValue();
        IntToLongFunction il = x -> (Integer.valueOf(x)).longValue();
        LongToDoubleFunction ld = x -> (Long.valueOf(x)).doubleValue();
        LongToIntFunction li = x -> (Long.valueOf(x)).intValue();

        BiFunction<Integer, Character, String> biFunction = (x, z) -> {
            if (Character.isUpperCase(z)) {
                return (x % 2) == 0 ? "EVEN" : "ODD";
            }
            return (x % 2) == 0 ? "even" : "odd";
        };

        Function<String, Double> biFunction2 = x -> x.equalsIgnoreCase("even") ? 3.0 : 4.0;
        Double d = biFunction.andThen(biFunction2).apply(4, 'U');

        ToIntBiFunction<String, Double> tib = (x, z) -> Integer.parseInt(x) + (z).intValue();
        ToLongBiFunction<Double, String> tlb = (x, z) -> x.longValue() + Long.parseLong(z);
        ToDoubleBiFunction<Integer, Long> tdb = (x, z) -> (x).doubleValue() + (z).doubleValue();

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
        System.out.println("--------------------------");
        System.out.println(di.applyAsInt(4.1));
        System.out.println(dl.applyAsLong(5.2));
        System.out.println(id.applyAsDouble(6));
        System.out.println(il.applyAsLong(7));
        System.out.println(ld.applyAsDouble(8));
        System.out.println(li.applyAsInt(9));
        System.out.println("----------------------------");
        System.out.println(biFunction.apply(7, 'a'));
        System.out.println("----------------------------");
        System.out.println(d);
        System.out.println("----------------------------");
        System.out.println(tib.applyAsInt("5", 4.2));
        System.out.println(tlb.applyAsLong(5.1, "6"));
        System.out.println(tdb.applyAsDouble(7, 8L));
    }
}
