package javaCodingProblems.reversingLettersAndWords;

public class Test {
    public static void main(String[] args) {
        System.out.println(reverseWords("I love Java!"));
    }

    private static final String WHITE_SPACE = " ";

    public static String reverseWords(String string) {
        String[] words = string.split(WHITE_SPACE);
        StringBuilder reversedString = new StringBuilder();

        for (String word : words) {
            StringBuilder reverseWord = new StringBuilder();
            for (int i = word.length() - 1; i >= 0; i--) {
                reverseWord.append(word.charAt(i));
            }
            reversedString.append(reverseWord).append(WHITE_SPACE);
        }
        return reversedString.toString();
    }
}
