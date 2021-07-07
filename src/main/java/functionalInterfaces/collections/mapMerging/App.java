package functionalInterfaces.collections.mapMerging;

import java.util.Map;
import java.util.TreeMap;
import java.util.function.BiFunction;

public class App {
    public static void main(String[] args) {
        Map<String, ClassExample> map = new TreeMap<>();
        map.put("k1", new ClassExample(1, 2, "Cat"));

        BiFunction<ClassExample, ClassExample, ClassExample> changeI2 =
                (ov, nv) -> new ClassExample(ov.i1, nv.i2, ov.s);

        BiFunction<ClassExample, ClassExample, ClassExample> changeS =
                (ov, nv) -> new ClassExample(ov.i1, ov.i2, nv.s);

        System.out.println(map.merge("k1", new ClassExample(0, 4, null), changeI2));
        System.out.println(map.merge("k1", new ClassExample(0, 0, "Cat"), changeS));
        System.out.println(map.merge("k2", new ClassExample(6, 7, "Bird"), changeS));

        System.out.println();
        map.forEach((x, y) -> System.out.println(x + " " + y));
    }
}
