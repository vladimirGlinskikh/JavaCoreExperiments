package javaCodingProblems.removingWhiteSpacesFromAString;

public class Test {
    public static void main(String[] args) {
        System.out.println(removeWhiteSpaces("I love Java!"));
    }

    public static String removeWhiteSpaces(String string) {
        return string.replaceAll("\\s", "");
    }
}
