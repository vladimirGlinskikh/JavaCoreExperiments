package stepic.arrayListBasic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListBasicExample {
    public static void main(String[] args) {
        List<Integer> elems = Arrays.asList(2, 45, 12, 5);
        int result = maxElem(elems);
        System.out.println(result);
    }

    public static Integer maxElem(List<Integer> list) {
        List<Integer> lst = new ArrayList<>();
        lst.addAll(list);
        int max = Collections.max(lst);
        return max;
    }
}
