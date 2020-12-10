package core.string.StringToInt;

public class StringToIntConverter {

    public static final int DEFAULT_PARSED_INT = 0;

    public int convertWithParseInt(String string) {
        int num = Integer.parseInt(string);
        return num;
    }

    public int convertWithParseIntWithRadix(String string, int radix) {
        int num = Integer.parseInt(string, radix);
        return num;
    }

    public int tryConvertWithParseInt(String string) {
        try {
            int number = Integer.parseInt(string);
            return number;
        } catch (NumberFormatException e) {
            return DEFAULT_PARSED_INT;
        }
    }

    public Integer convertWithValueOf(String string) {
        try {
            Integer num = Integer.valueOf(string);
            return num;
        } catch (NumberFormatException e) {
            return DEFAULT_PARSED_INT;
        }
    }
}
