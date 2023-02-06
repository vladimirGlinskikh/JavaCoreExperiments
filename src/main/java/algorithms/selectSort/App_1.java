package algorithms.selectSort;

public class App_1 {
    static char[] arrayChar = {'b', ';', '.', 'e', 'o', 'g', ',', 'a', ':'};

    public static void main(String[] args) {

        for (Character ch : arrayChar) {
            System.out.print(ch + " ");
        }


        for (int i = 0; i < arrayChar.length; i++) {
            int index = min(arrayChar, i, arrayChar.length);
            int tmp = arrayChar[i];
            arrayChar[i] = arrayChar[index];
            arrayChar[index] = (char) tmp;
        }

        System.out.println(" ");

        for (Character ch : arrayChar) {
            System.out.print(ch + " ");
        }
    }

    private static int min(char[] array, int start, int end) {
        int minIndex = start;
        int minValue = array[start];
        for (int i = start + 1; i < end; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
}
