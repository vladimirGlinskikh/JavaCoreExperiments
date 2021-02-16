package sololearn.binaryConverter;

public class Converter {
    public static String toBinary(int x) {
        String binary = "";
        while (x > 0) {
            binary = (x % 2) + binary;
            x /= 2;
        }
        return binary;
    }
}
