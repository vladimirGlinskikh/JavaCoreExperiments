package javaCodingProblems.checkingWhetherAStringContainsOnlyDigits;

public class Test {
    public static void main(String[] args) {
        System.out.println(containsOnlyDigits("12 I love Java!"));
    }

    public static boolean containsOnlyDigits(String string) {
        for (int i = 0; i < string.length(); i++) {
            if (!Character.isDigit(string.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
