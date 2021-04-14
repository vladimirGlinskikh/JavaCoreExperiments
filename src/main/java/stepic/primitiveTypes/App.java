package stepic.primitiveTypes;

public class App {
    public static void main(String[] args) {
        System.out.println(subtractTheSecondNumberFromTheFirst(7, 2));
    }

    public static int subtractTheSecondNumberFromTheFirst(int first, int second) {
        int count;
        count = first / second;
        return count;
    }
}
