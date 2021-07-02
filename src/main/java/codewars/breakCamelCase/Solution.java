package codewars.breakCamelCase;

public class Solution {
    public static String camelCase(String input) {
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            Character ch = input.charAt(i);
            if (Character.isUpperCase(ch))
                result += " " + ch;
            else
                result += ch;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(camelCase("inputSame"));
    }
}
