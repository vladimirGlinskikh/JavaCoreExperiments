package javaCodingProblems.countingTheOccurrencesOfACertainCharacter;

public class Test {
    public static void main(String[] args) {
        System.out.println(countOccurrencesOfACertainCharacter("I love Java!", 'a'));
    }

//    public static int countOccurrencesOfACertainCharacter(String string, char ch) {
//        return string.length() - string.replace(String.valueOf(ch), "").length();
//    }

//    public static int countOccurrencesOfACertainCharacter(String string, String ch) {
//        if (ch.codePointCount(0, ch.length()) > 1) {
//            return -1;
//        }
//
//        int result = string.length() - string.replace(ch, "").length();
//        return ch.length() == 2 ? result / 2 : result;
//    }

//    public static int countOccurrencesOfACertainCharacter(String string, char ch) {
//        int count = 0;
//        for (int i = 0; i < string.length(); i++) {
//            if (string.charAt(i) == ch) {
//                count++;
//            }
//        }
//        return count;
//    }

    public static long countOccurrencesOfACertainCharacter(String string, char ch) {
        return string.chars()
                .filter(c -> c == ch)
                .count();
    }
}
