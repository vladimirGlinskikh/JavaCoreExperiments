package core.objects.creation;

public class Test {
    public static void main(String[] args) {
        Point point = null;
        try {
            point = (Point) Class.forName("core.objects.creation.Point").newInstance();
        } catch (Exception e) {
            System.err.println(e);
        }

        Point array[] = {new Point(9, 0), new Point(3, 2)};
        System.out.println("point: " + point);
        System.out.println("array: { " + array[0] + ", " + array[1] + "}");

        String string[] = new String[3];
        string[0] = "he";
        string[1] = "llo!";
        System.out.println(string[0] + string[1]);
    }
}
