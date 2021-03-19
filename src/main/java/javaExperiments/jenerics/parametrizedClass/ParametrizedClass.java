package javaExperiments.jenerics.parametrizedClass;

public class ParametrizedClass {
    public static void main(String[] args) {
        Info<String> infoString = new Info<>("Some text");
        System.out.println(infoString.message("I'm String: ") + infoString);

        Info<Integer> infoInteger = new Info<>(23);
        System.out.println(infoInteger.message("I'm Integer: ") + infoInteger);

        Info<Object> infoObject = new Info<>(ParametrizedClass.class);
        System.out.println(infoInteger.message("I'm Object №: " + infoObject.hashCode()) + " and my name: " + infoObject.getClass());

        Pair<String, Integer> pairValue = new Pair<>("Some text", 23);
        System.out.println(pairValue.message("I'm PairClass: ") + pairValue);
    }
}

class Info<T> {
    private T value;

    public Info(T value) {
        this.value = value;
    }

    public String message(String s) {
        return s;
    }

    public String toString() {
        return "{[" + value + "]}";
    }
}

class Pair<V1, V2> {
    private V1 value1;
    private V2 value2;

    public Pair(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public String message(String s) {
        return s;
    }

    public String toString() {
        return "{[" + value1 + ", " + value2 + "]}";
    }
}
