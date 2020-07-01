package core.collection;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        System.out.println( map.put("килька", 17));
        System.out.println( map.put("сардина", 14));
        System.out.println( map.put("сардина", 7));

        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.isEmpty());
    }
}
