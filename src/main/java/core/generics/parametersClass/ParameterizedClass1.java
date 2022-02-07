package core.generics.parametersClass;

public class ParameterizedClass1 {
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("Vladimir", 12);
        System.out.println(pair1);
        System.out.println("value1= " + pair1.getFirstValue());
        System.out.println("value2= " + pair1.getSecondValue());
        System.out.println("----------------------");

        Pair<Integer, Double> pair2 = new Pair<>(21, 12.80);
        System.out.println(pair2);
        System.out.println("value1= " + pair2.getFirstValue());
        System.out.println("value2= " + pair2.getSecondValue());
        System.out.println("----------------------");

        Pair<Integer, Integer> pair3 = new Pair<>(21, 12);
        System.out.println(pair3);
        System.out.println("value1= " + pair3.getFirstValue());
        System.out.println("value2= " + pair3.getSecondValue());
        System.out.println("----------------------");

        OtherPair<Integer> otherPair = new OtherPair<>(21, 12);
        System.out.println(otherPair);
        System.out.println("value1= " + otherPair.getFirstValue());
        System.out.println("value2= " + otherPair.getSecondValue());
        System.out.println("----------------------");
    }
}

class Pair<V1, V2> {
    private final V1 value1;
    private final V2 value2;

    public Pair(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V1 getFirstValue() {
        return value1;
    }

    public V2 getSecondValue() {
        return value2;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "value1=" + value1 +
                ", value2=" + value2 +
                '}';
    }
}

class OtherPair<V> {
    private final V value1;
    private final V value2;

    public OtherPair(V value1, V value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V getFirstValue() {
        return value1;
    }

    public V getSecondValue() {
        return value2;
    }

    @Override
    public String toString() {
        return "OtherPair{" +
                "value1=" + value1 +
                ", value2=" + value2 +
                '}';
    }
}
