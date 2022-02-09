package core.generics.subtyping;

public class SubtypingApp {
    public static void main(String[] args) throws NoSuchFieldException {
        X<Integer> x = new X<>();

        // ошибка
//      Y<Integer> y = new Y<>();
        Y<Double> y1 = new Y<>();
    }
}

class X<T extends Number> {
}

class Y<I extends Double> extends X {
}
