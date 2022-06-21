package stepic.linkedList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        String[] numbers = str.split(" ");

        LinkedList<Integer> ll = new LinkedList<>();

        for (String num : numbers) {
            ll.add(Integer.parseInt(num));
        }

        ll.remove(ll.size() - 1);
        ll.remove(ll.size() - 1);
        ll.remove(ll.size() - 1);

        Collections.sort(ll);

        for (Integer num : ll) {
            System.out.println(num);
        }
    }
}
