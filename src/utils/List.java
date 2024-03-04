package utils;

import java.util.NoSuchElementException;

public interface List<E> {
    Iterator<E> iterator();
    boolean add(E item);
    void add(int index, E item);
    boolean addAll(List<E> otherList);
    void clear();
    boolean contains(E item);
    E get(int index);
    int indexOf(E item);
    boolean isEmpty();
    E remove(int index);
    boolean remove(E item);
    E set(int index, E item);
    int size();

    // Additional default methods
    default void addFirst(E item) {
        add(0, item);
    }

    default void addLast(E item) {
        add(size(), item);
    }

    default E getFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("List is empty");
        }
        return get(0);
    }

    default E getLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("List is empty");
        }
        return get(size() - 1);
    }

    default E removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("List is empty");
        }
        return remove(0);
    }

    default E removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("List is empty");
        }
        return remove(size() - 1);
    }
}
