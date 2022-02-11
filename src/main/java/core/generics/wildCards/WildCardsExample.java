package core.generics.wildCards;

import java.util.ArrayList;
import java.util.List;

public class WildCardsExample {
    public static void main(String[] args) {
        List<?> list = new ArrayList<Number>();
//        list.add("sd");

        List<? extends Number> list0 = new ArrayList<Integer>();

        List<Double> list1 = new ArrayList<>();
        list1.add(2.12);
        list1.add(3.12);
        list1.add(4.34);
        showList(list1);
        System.out.println("---------------------");

        List<String> list2 = new ArrayList<>();
        list2.add("one");
        list2.add("two");
        list2.add("three");
        showList(list2);
        System.out.println("-------------------------");

        ArrayList<Double> ald = new ArrayList<>();
        ald.add(2.12);
        ald.add(3.12);
        ald.add(4.34);
        System.out.println(sum(ald));
        System.out.println("-------------------------");

        ArrayList<Integer> ali = new ArrayList<>();
        ali.add(2);
        ali.add(3);
        ali.add(4);
        System.out.println(sum(ali));
    }

    static void showList(List<?> list) {
        System.out.println("My list contains the following elements " + list);
    }

    public static double sum(ArrayList<? extends Number> al) {
        double sum = 0;
        for (Number n : al) {
            sum += n.doubleValue();
        }
        return sum;
    }
}
