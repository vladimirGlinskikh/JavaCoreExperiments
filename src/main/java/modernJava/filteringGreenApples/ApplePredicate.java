package modernJava.filteringGreenApples;

@FunctionalInterface
public interface ApplePredicate {
    boolean test(Apple apple);
}
