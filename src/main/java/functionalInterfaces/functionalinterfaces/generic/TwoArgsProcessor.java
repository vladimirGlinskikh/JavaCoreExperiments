package functionalInterfaces.functionalinterfaces.generic;

@FunctionalInterface
public interface TwoArgsProcessor<X> {
    X process(X args1, X args2);
}
