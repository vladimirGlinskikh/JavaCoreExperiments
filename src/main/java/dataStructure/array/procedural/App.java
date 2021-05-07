package dataStructure.array.procedural;

public class App {
    public static void main(String[] args) {
        long[] array = new long[100];
        int j;
        int nElems;
        long searchKey;
//--------------------------------INSERT elements
        array[0] = 12;
        array[1] = 34;
        array[2] = 4;
        array[3] = 6;
        array[4] = 56;
        array[5] = 3;
        array[6] = 5;
        array[7] = 8;
        array[8] = 85;
        array[9] = 22;
        nElems = 10;

        for (int i = 0; i < nElems; i++)
            System.out.print(array[i] + " ");
        System.out.println();

//-----------------------------------------------SEARCH element
        int i;
        searchKey = 3;
        for (i = 0; i < nElems; i++)
            if (array[i] == searchKey) {
                break;
            }

        System.out.println(i == nElems ? "Can't find " + searchKey : "Found " + searchKey);

        for (j = 0; j < nElems; j++)
            System.out.print(array[j] + " ");
        System.out.println();

//------------------------------------------------------- DELETE element
        for (j = 0; j < nElems; j++)
            if (array[j] == searchKey)
                break;

        if (nElems - 1 - j >= 0)
            System.arraycopy(array, j + 1, array, j, nElems - 1 - j);
        nElems--;
        System.out.println(i == nElems ? "Can't find " + searchKey : "Delete " + searchKey);

        for (int k = 0; k < nElems; k++)
            System.out.print(array[k] + " ");
        System.out.println();
    }
}
