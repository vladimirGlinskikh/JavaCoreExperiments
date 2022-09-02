package hexlet;

import org.apache.commons.lang3.StringUtils;

public class ConvertString {
    public static String convertString(String string) {

        if (string.isEmpty()) {
            return "";
        }

        if (Character.isUpperCase(string.charAt(0))) {
            return string;
        }

        if (Character.isLowerCase(string.charAt(0))) {
            return StringUtils.reverse(string);
        }
        return string;
    }
}
