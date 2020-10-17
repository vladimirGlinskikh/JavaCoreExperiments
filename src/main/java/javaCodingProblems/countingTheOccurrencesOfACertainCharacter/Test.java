package javaCodingProblems.countingTheOccurrencesOfACertainCharacter;

public class Test {
    public static void main(String[] args) {
        System.out.println(countOccurrencesOfACertainCharacter("I love Java!", 'a'));
    }

    public static int countOccurrencesOfACertainCharacter(String string, char ch) {
        return string.length() - string.replace(String.valueOf(ch), "").length();
    }
}
