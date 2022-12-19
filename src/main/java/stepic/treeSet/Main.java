package stepic.treeSet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] sets = reader.readLine().split(";");
        String[] s1 = sets[0].split(" ");
        String[] s2 = sets[1].split(" ");
        String[] s3 = sets[2].split(" ");

        TreeSet<Integer> set1 = new TreeSet<>();
        for (String value : s1) {
            Integer in = Integer.parseInt(value);
            set1.add(in);
        }

        TreeSet<Integer> set2 = new TreeSet<>();
        for (String s : s2) {
            Integer in = Integer.parseInt(s);
            set2.add(in);
        }

        TreeSet<Integer> set3 = new TreeSet<>();
        for (String s : s3) {
            Integer in = Integer.parseInt(s);
            set3.add(in);
        }

        Set<Integer> resultTreeSet = unionTreeLargeNumber(set1, set2, set3);

    }

    public static TreeSet<Integer> unionTreeLargeNumber(TreeSet<Integer> set1, TreeSet<Integer> set2, TreeSet<Integer> set3) {
        TreeSet<Integer> resultSet = new TreeSet<>(Comparator.reverseOrder());
        resultSet.add(set1.last());
        resultSet.add(set2.last());
        resultSet.add(set3.last());
        resultSet.forEach(value -> System.out.println(value));
        return resultSet;
    }
}
