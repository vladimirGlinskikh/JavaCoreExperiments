package stepic.wildcards;

public interface Box<T> {
    void put(T item);

    T get();
}
