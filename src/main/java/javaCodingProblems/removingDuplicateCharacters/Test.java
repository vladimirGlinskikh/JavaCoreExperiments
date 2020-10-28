package javaCodingProblems.removingDuplicateCharacters;

public class Test {
    public static void main(String[] args) {
        System.out.println(removeDuplicates("I love Java!"));
    }

    public static String removeDuplicates(String string) {
        char[] chArray = string.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();

        for (char ch : chArray) {
            if (stringBuilder.indexOf(String.valueOf(ch)) == -1) {
                stringBuilder.append(ch);
            }
        }
        return stringBuilder.toString();
    }
}
