package javaCodingProblems.generatingAllPermutations;

import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
//        permuteAndPrint("", "abc");
        System.out.println(permuteAndStore("", "Java"));
    }

//    public static void permuteAndPrint(String prefix, String string) {
//        int n = string.length();
//        if (n == 0) {
//            System.out.print(prefix + " ");
//        } else {
//            for (int i = 0; i < n; i++) {
//                permuteAndPrint(prefix + string.charAt(i),
//                        string.substring(i + 1, n) + string.substring(0, i));
//            }
//        }
//    }

    public static Set<String> permuteAndStore(String prefix, String string) {
        Set<String> permutations = new HashSet<>();
        int n = string.length();

        if (n == 0) {
            permutations.add(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                permutations.addAll(permuteAndStore(prefix + string.charAt(i),
                        string.substring(i + 1, n) + string.substring(0, i)));
            }
        }
        return permutations;
    }
}
