package javaCodingProblems.checkingWhetherAStringContainsOnlyDigits;

import javax.print.DocFlavor;

public class Test {
    public static void main(String[] args) {
        System.out.println(containsOnlyDigits("12 I love Java!"));
    }

//    public static boolean containsOnlyDigits(String string) {
//        for (int i = 0; i < string.length(); i++) {
//            if (!Character.isDigit(string.charAt(i))) {
//                return false;
//            }
//        }
//        return true;
//    }

//    public static boolean containsOnlyDigits(String string) {
//        return !string.chars()
//                .anyMatch(n -> !Character.isDigit(n));
//    }

    public static boolean containsOnlyDigits(String string){
        return string.matches("[0-9]+");
    }
}
