package core.generics.typeErasure;

public class TypeErasureExample {
    public static void main(String[] args) {

    }

//    public void exampleErasure(Info<String> info) {
//        String s = info.getValue();
//    }
//
//    public void exampleErasure(Info<Integer> info) {
//        Integer i = info.getValue();
//    }
}

class Info<T> {
    private final T value;

    public Info(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Info{" +
                "value=" + value +
                '}';
    }
}

class Parent {
    public void exampleErasure(Info<String> info) {
        String s = info.getValue();
    }
}

//class Child extends Parent {
//    public void exampleErasure(Info<Integer> info) {
//        Integer i = info.getValue();
//    }
//}
