package stepic.arrayListBasic2;

import java.util.*;

public class ArrayListBasicExample {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("hi", "hello", "goodmorning", "ass");
        String result = String.valueOf(changeList(strings));
        System.out.println(result);
    }

    static List<String> changeList(List<String> list) {
        List<String> str = new ArrayList<>();
        str.addAll(list);
        String max = Collections.max(str, Comparator.comparing(s -> s.length()));
        for (int i = 0; i < str.size(); i++)
            System.out.println(max);
        return new ArrayList<>();
    }
}
