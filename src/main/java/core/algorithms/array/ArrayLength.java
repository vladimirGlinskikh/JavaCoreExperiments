package core.algorithms.array;

public class ArrayLength {
    public static void main(String[] args) {
        int[] intArray = {0, 2, 4, 6, 1};
        int arrayLength = intArray.length;
        System.out.println("Elements in array after= " + arrayLength);
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
        System.out.println("-------");

        intArray[2] = 55;
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
        System.out.println("Elements in array before " + arrayLength);
    }
}
