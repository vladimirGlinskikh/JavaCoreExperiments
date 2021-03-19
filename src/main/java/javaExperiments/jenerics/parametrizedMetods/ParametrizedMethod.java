package javaExperiments.jenerics.parametrizedMetods;

import java.util.ArrayList;
import java.util.List;

public class ParametrizedMethod {
    public static void main(String[] args) {
        List<Integer> arrList = new ArrayList<>();
        arrList.add(11);
        arrList.add(3);
        arrList.add(7);
        int a = GenericMethod.genSecondElement(arrList);
        System.out.println(a);
    }
}

class GenericMethod {
    public static <T> T genSecondElement(List<T> al) {
        return al.get(1);
    }
}
