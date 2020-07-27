package core.filtering.consumer;

@FunctionalInterface
public interface Consumer<T> {
    void accept(T t);
}
