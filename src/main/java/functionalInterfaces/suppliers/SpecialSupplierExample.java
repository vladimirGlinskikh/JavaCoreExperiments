package functionalInterfaces.suppliers;

import java.util.Random;
import java.util.function.BooleanSupplier;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;

public class SpecialSupplierExample {
    public static Random random = new Random();

    public static void main(String[] args) {
        BooleanSupplier genBol = () -> random.nextInt(2) == 1;
        IntSupplier genInt = () -> random.nextInt();
        LongSupplier genLng = () -> random.nextLong();
        DoubleSupplier genDbl = () -> random.nextDouble();

        System.out.println(genBol.getAsBoolean());
        System.out.println(genInt.getAsInt());
        System.out.println(genLng.getAsLong());
        System.out.println(genDbl.getAsDouble());
    }
}
