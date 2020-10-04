package core.outputFormatting;

import java.text.DecimalFormat;

public class Test {
    public static void main(String[] args) {
//        double grossPay = 800.40;
//        System.out.println(grossPay);

//        DecimalFormat decimalFormat = new DecimalFormat(" $#,###.00");
//        double grossPay = 800.417;
//        System.out.println(decimalFormat.format(grossPay));

        double grossPay = 1234.567;
        String name = "Vladimir Glinskikh";
        System.out.printf("%s $%,1.2f", name, grossPay);
    }
}
