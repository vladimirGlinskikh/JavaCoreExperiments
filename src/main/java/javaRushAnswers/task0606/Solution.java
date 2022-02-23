package javaRushAnswers.task0606;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Solution {

    public static <T> List<T> universalMethod(Collection<T> list) {
        return new ArrayList<>(list);
    }

    public static void main(String[] args) {
        List<Byte> byteParam = new ArrayList<>();
        byteParam.add((byte) 1);
        System.out.println("universalMethod(" + byteParam + ") with byte parameter");

        List<Short> shortParam = new ArrayList<>();
        shortParam.add((short) 2);
        System.out.println("universalMethod(" + shortParam + ") with short parameter");

        List<Integer> intParam = new ArrayList<>();
        intParam.add(3);
        System.out.println("universalMethod(" + intParam + ") with int parameter");

        List<Long> longParam = new ArrayList<>();
        longParam.add(4L);
        System.out.println("universalMethod(" + longParam + ") with long parameter");

        List<Float> floatParam = new ArrayList<>();
        floatParam.add(5F);
        System.out.println("universalMethod(" + floatParam + ") with float parameter");

        List<Double> doubleParam = new ArrayList<>();
        doubleParam.add(6.0);
        System.out.println("universalMethod(" + doubleParam + ") with double parameter");

        List<Boolean> booleanParam = new ArrayList<>();
        booleanParam.add(true);
        System.out.println("universalMethod(" + booleanParam + ") with boolean parameter");

        List<Character> characterParam = new ArrayList<>();
        characterParam.add('A');
        System.out.println("universalMethod(" + characterParam + ") with char parameter");

        List<String> stringParam = new ArrayList<>();
        stringParam.add("String");
        System.out.println("universalMethod(" + stringParam + ") with string parameter");

        List<Object> universalParam = new ArrayList<>();
        universalParam.add(byteParam);
        universalParam.add(shortParam);
        universalParam.add(intParam);
        universalParam.add(longParam);
        universalParam.add(floatParam);
        universalParam.add(doubleParam);
        universalParam.add(booleanParam);
        universalParam.add(characterParam);
        universalParam.add(stringParam);

        for (int i = 0; i < universalParam.size(); i++) {
            universalMethod(universalParam);
        }
        System.out.println("Parent method: universalMethod(" + universalMethod(new ArrayList<>()) + ")");
    }
}
