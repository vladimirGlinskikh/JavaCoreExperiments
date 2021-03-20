package javaExperiments.jenerics.subtyping;

public class Info<T extends Number> {
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