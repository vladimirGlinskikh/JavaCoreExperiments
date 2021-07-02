package codewars.writeNumberInExpandForm;

public class Kata {
    public static String expandedForm(int num) {
        String outs = "";
        for (int i = 10; i < num; i *= 10) {
            int rem = num % i;
            outs = (rem > 0) ? " + " + rem + outs : outs;
            num -= rem;
        }
        outs = num + outs;
        return outs;
    }

    public static void main(String[] args) {
        System.out.println(expandedForm(1247));
    }
}
