package stepic.iterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class IteratorExample {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number = reader.readLine();
        String[] parts = number.split(" ");

        List<Integer> list = new ArrayList<>();
        for (String str : parts) {
            list.add(Integer.valueOf(str));
        }

        Collections.sort(list);

        for (Integer temp : list) {
            int elem = Integer.parseInt(String.valueOf(temp));
            if (elem % 2 != 0) {
                System.out.println(temp);
            }
        }
    }
}
