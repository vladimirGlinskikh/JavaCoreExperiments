package javaCodingProblems.stringsAndNumbers.summingTwoLargeIntLongValuesAndOperationOverflow;

public class App {
    public static void main(String[] args) {
        int x = Integer.MAX_VALUE;
        int y = Integer.MAX_VALUE;
        int z = x + y;
        System.out.println(z);
        System.out.println("-----------------");
        long x1 = Integer.MAX_VALUE;
        long y1 = Integer.MAX_VALUE;
        long z1 = x1 + y1;
        System.out.println(z1);
        System.out.println("-------------------");
        long x2 = Long.MAX_VALUE;
        long y2 = Long.MAX_VALUE;
        long z2 = Long.sum(x2, y2);
        System.out.println(z2);
        System.out.println("--------------------");
    }
}
