package functionalInterfaces.consumers;

import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;

public class ObjBiConsumerExample {
    public static void main(String[] args) {
        ObjIntConsumer<String> oic = (x, y) -> System.out.println(x + " = " + y);
        ObjLongConsumer<String> olc = (x, y) -> System.out.println(Long.parseLong(x) + y);
        ObjDoubleConsumer<String> odc = (x, y) -> System.out.println(x + (y));

        oic.accept("Value", 4);
        olc.accept("7", 2L);
        odc.accept("DBL ", 4.1);
    }
}
