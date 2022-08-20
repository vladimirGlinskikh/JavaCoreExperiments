import org.apache.commons.lang3.StringUtils;

public class App {
    public static boolean isPalindrome(String str) {
        return str.equalsIgnoreCase(StringUtils.reverse(str));
    }

    public static void main(String[] args) {
        System.out.println(App.isPalindrome("dkjk"));
    }
}
