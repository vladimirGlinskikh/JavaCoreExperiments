package core.collection.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1_000, "Vladimir Glinskikh");
        map.put(2_345, "Andrey Koshinsky");
        map.put(3_345, "Andrey Shatalov");
        map.put(2_562, "Svetlana Kim");
        map.put(1_873, "Elena Berdikova");
        map.putIfAbsent(1_000, "Elena Kim");
        System.out.println(map);
        System.out.println("------------------");
        System.out.println(map.get(1000));
        System.out.println("------------------");
        map.remove(2_345);
        System.out.println(map);
        System.out.println("------------------");
        System.out.println(map.containsValue("Vladimir Glinskikh"));
        System.out.println("------------------");
        System.out.println(map.containsKey(500));
        System.out.println("------------------");
        System.out.println(map.keySet());
        System.out.println("------------------");
        System.out.println(map.values());
        System.out.println("------------------");
    }
}
