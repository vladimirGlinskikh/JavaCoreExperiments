package stepic.primitiveTypes;

public class App {
    public static void main(String[] args) {
        System.out.println(subtractTheSecondNumberFromTheFirst(55, 23));
    }

    public static String subtractTheSecondNumberFromTheFirst(int first, int second) {
        int count;
        count = first / second;
        return count + " " + first % second;
    }
}
