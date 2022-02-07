package core.generics.introduction;

public class Main {
    public static void main(String[] args) {
        OptionExample<String> present = new OptionExample<>("Yes");
        OptionExample<String> absent = new OptionExample<>(null);

        System.out.println(present.isPresent());
        System.out.println(present.get());
        System.out.println(absent.isPresent());
        System.out.println(absent.orElse("No"));
        System.out.println("-------------------------");

        var present1 = new OptionExample<>("Yes");
        var absent1 = new OptionExample<>(null);
        System.out.println(present1.orElse("No").length());
        System.out.println(absent1.orElse("No"));
        System.out.println("--------------------------");

        OptionExample<?> present2 = new OptionExample<>("Yes");
        System.out.println(present2.isPresent());
        System.out.println(present2.get());
        Object value = present2.get();
        System.out.println(value);
        present2.set(null);
        System.out.println("---------------------------");

        OptionExample<Object> present3 = new OptionExample<>("Yes");
        System.out.println(present3.isPresent());
        Object value3 = present3.get();
        System.out.println(value3);
        present3.set(123);
        System.out.println("----------------------------");

        OptionExample<? extends Number> number = new OptionExample<>(123);
        Number n = number.get();
        System.out.println(n);
        number.set(null);
    }
}
