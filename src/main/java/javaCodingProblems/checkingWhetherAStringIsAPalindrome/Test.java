package javaCodingProblems.checkingWhetherAStringIsAPalindrome;

public class Test {
    public static void main(String[] args) {
        System.out.println(isPalindrome("I love Java"));
    }

    public static boolean isPalindrome(String string) {
        int left = 0;
        int right = string.length() - 1;

        while (right > left){
            if (string.charAt(left) != string.charAt(right)){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
