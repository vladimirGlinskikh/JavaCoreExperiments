package core.generics.parametersClass;

public class ParameterizedClass {
    public static void main(String[] args) {
        Info<String> info1 = new Info<>("Hello");
        System.out.println(info1);
        String stringInfo = info1.getValue();
        System.out.println(stringInfo);
        System.out.println("-----------------------------");

        Info<Integer> info2 = new Info<>(4);
        System.out.println(info2);
        Integer intInfo2 = info2.getValue();
        System.out.println(intInfo2);
        System.out.println("-----------------------------");

        Info<People> info3 = new Info<>(new People("Vladimir", 100_500));
        System.out.println(info3);
        People objInfo3 = info3.getValue();
        System.out.println(objInfo3);
        System.out.println("-----------------------------");

        Info<People> info4 = new Info<>(new People("Svetlana", 18));
        System.out.println(info4);
        People objInfo4 = info4.getValue();
        System.out.println(objInfo4);
        System.out.println("-----------------------------");
    }
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

class People {
    private final String name;
    private final int age;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
