package javaExperiments.jenerics.typeErasure;

public class Info<T> {
    private T value;

    public Info(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public String message(String s) {
        return s;
    }

    public String toString() {
        return "{[" + value + "]}";
    }
}