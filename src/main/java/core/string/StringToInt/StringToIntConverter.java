package core.string.StringToInt;

public class StringToIntConverter {

    public int convertWithParseInt(String string) {
        int num = Integer.parseInt(string);
        return num;
    }

    public int convertWithParseIntWithRadix(String string, int radix) {
        int num = Integer.parseInt(string, radix);
        return num;
    }
}
