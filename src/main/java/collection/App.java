package collection;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("key", 17);
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.isEmpty());
    }
}
