package utils;

public interface Iterator<E> {
    boolean hasNext();
    E next();
    void remove();
}
