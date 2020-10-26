package javaCodingProblems.generatingAllPermutations;

public class Test {
    public static void main(String[] args) {
        permuteAndPrint("", "abc");
    }

    public static void permuteAndPrint(String prefix, String string) {
        int n = string.length();
        if (n == 0) {
            System.out.print(prefix + " ");
        } else {
            for (int i = 0; i < n; i++) {
                permuteAndPrint(prefix + string.charAt(i),
                        string.substring(i + 1, n) + string.substring(0, i));
            }
        }
    }
}
