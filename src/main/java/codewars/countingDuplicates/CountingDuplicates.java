package codewars.countingDuplicates;

import java.util.HashMap;
import java.util.Map;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        Map<String, Integer> map = new HashMap<>();
        int count = 0;

        for (int i = 0; i < text.length(); i++)
            map.merge(text.toLowerCase().charAt(i) + "", 1, Integer::sum);

        for (Integer value : map.values())
            if (value > 1)
                count++;

        return count;
    }
}
