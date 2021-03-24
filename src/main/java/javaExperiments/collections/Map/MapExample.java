package javaExperiments.collections.Map;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1213, "Vladimir");
        map.put(14654, "Svetlana");
        map.put(1345, "Oleg");
        map.put(1754, "Nikolay");
        map.put(1234, "Elena");
        System.out.println(map);
        System.out.println("---------------------");

        System.out.println("putIfAbsent(): " + map.putIfAbsent(2322, "Maria"));
        System.out.println(map);
        System.out.println("-------------------");

        System.out.println("get(): " + map.get(1754));
        System.out.println("-------------------");

        System.out.println("remove(): " + map.remove(1754));
        System.out.println(map);
        System.out.println("-----------------------");

        System.out.println("containsValue(): " + map.containsValue("Maria"));
        System.out.println(map);
        System.out.println("-----------------------");

        System.out.println("containsKey(): " + map.containsKey(2322));
        System.out.println(map);
        System.out.println("-----------------------");

        System.out.println("keySet(): " + map.keySet());
        System.out.println(map);
        System.out.println("-----------------------");

        System.out.println("values(): " + map.values());
        System.out.println(map);
        System.out.println("-----------------------");

        System.out.println("entrySet(): " + map.entrySet());
        System.out.println(map);
        System.out.println("-----------------------");
    }
}
