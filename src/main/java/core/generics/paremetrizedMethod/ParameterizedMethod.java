package core.generics.paremetrizedMethod;

import java.util.ArrayList;

public class ParameterizedMethod {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(7);
        int a = GenMethod.getSecondElement(arrayList);
        System.out.println(a);
        System.out.println("---------------------");

        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("one");
        arrayList1.add("two");
        arrayList1.add("three");
        String s = GenMethod.getSecondElement(arrayList1);
        System.out.println(s);
        System.out.println("---------------------");

        ArrayList<Person> arrayList2 = new ArrayList<>();
        arrayList2.add(new Person("Vladimir", 23));
        arrayList2.add(new Person("Svetlana", 29));
        arrayList2.add(new Person("Alexandr", 21));
        Person person = GenMethod.getSecondElement(arrayList2);
        System.out.println(person);
        System.out.println("---------------------");
    }
}

class GenMethod {
    public static <T> T getSecondElement(ArrayList<T> al) {
        return al.get(1);
    }
}

class Person {
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
