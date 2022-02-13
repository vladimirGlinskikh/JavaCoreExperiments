package core.collection.arrayList;

import java.util.Arrays;
import java.util.List;

public class ArrayListMethodsPartThree {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("A");
        StringBuilder stringBuilder1 = new StringBuilder("B");
        StringBuilder stringBuilder2 = new StringBuilder("C");
        StringBuilder stringBuilder3 = new StringBuilder("D");
        StringBuilder[] array = {stringBuilder, stringBuilder1, stringBuilder2, stringBuilder3};
        List<StringBuilder> list = Arrays.asList(array);
        System.out.println(list);
        array[0].append("E");
        System.out.println(list);
        System.out.println("------------------------");
        Object[] arrayObj = list.toArray();
        for (Object s : arrayObj){
            System.out.print(s + ", ");
        }
    }
}
