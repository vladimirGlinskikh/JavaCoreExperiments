package core.methodDeclarations.finalMethod;

public class Test {
    public static void main(String[] args) {
        Point[] points = new Point[100];
        for (int i = 0; i < points.length; i++) {
            points[i] = new Point();
//            points[i].move(i, points.length - 1 - i);
//            System.out.println(i);
            Point pi = points[i];
            int j = points.length - 1 - i;
            System.out.println(pi.x += i);
            System.out.println("--------------");
            System.out.println(pi.y += j);
        }
    }
}
