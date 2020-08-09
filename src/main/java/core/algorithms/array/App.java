package core.algorithms.array;

public class App {
    public static void main(String[] args) {
        long[] arr = new long[100];
        int nElems = 0;
        int j;
        long searchKey;

        arr[0] = 22;
        arr[1] = 56;
        arr[2] = 34;
        arr[3] = 46;
        arr[4] = 27;
        arr[5] = 83;
        arr[6] = 67;
        arr[7] = 29;
        arr[8] = 69;
        arr[9] = 20;
        nElems = 10;

        for (j = 0; j < nElems; j++)
            System.out.print(arr[j] + " ");
            System.out.println("");

        searchKey = 67;
        for (j = 0; j < nElems; j++)
            if (arr[j] == searchKey)
                break;
            if (j == nElems)
                System.out.println("Can't find " + searchKey);
            else
                System.out.println("Found " + searchKey);

        searchKey = 56;
        for (j = 0; j < nElems; j++)
            if (arr[j] == searchKey)
                break;

            for (int k = j; k < nElems; k++)
                arr[k] = arr[k + 1];
                nElems--;

        for (j = 0; j < nElems; j++)
            System.out.print(arr[j] + " ");
            System.out.println("");
    }
}
