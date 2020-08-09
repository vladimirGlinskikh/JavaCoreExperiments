package core.algorithms.array;

public class App {
    public static void main(String[] args) {
        LowArray arr = new LowArray(100);
        int nElems = 0;
        int j;

        arr.setElem(0, 22);
        arr.setElem(1, 56);
        arr.setElem(2, 34);
        arr.setElem(3, 46);
        arr.setElem(4, 27);
        arr.setElem(5, 83);
        arr.setElem(6, 67);
        arr.setElem(7, 29);
        arr.setElem(8, 69);
        arr.setElem(9, 20);
        nElems = 10;

        for (j = 0; j < nElems; j++)
            System.out.print(arr.getElem(j) + " ");
        System.out.println("");

        int searchKey = 67;
        for (j = 0; j < nElems; j++)
            if (arr.getElem(j) == searchKey)
                break;
        if (j == nElems)
            System.out.println("Can't find " + searchKey);
        else
            System.out.println("Found " + searchKey);

        for (j = 0; j < nElems; j++)
            if (arr.getElem(j) == 56)
                break;

        for (int k = j; k < nElems; k++)
            arr.setElem(k, arr.getElem(k + 1));
        nElems--;

        for (j = 0; j < nElems; j++)
            System.out.print(arr.getElem(j) + " ");
        System.out.println("");
    }
}
