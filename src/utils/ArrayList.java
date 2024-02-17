package utils;

import java.util.NoSuchElementException;

public class ArrayList<E> implements List<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private int size = 0;
    private E[] array;

    @SuppressWarnings("unchecked")
    public ArrayList() {
        array = (E[]) new Object[DEFAULT_CAPACITY];
    }

    @SuppressWarnings("unchecked")
    public ArrayList(int capacity) {
        if (capacity < 0) throw new IllegalArgumentException("Capacity cannot be negative.");
        array = (E[]) new Object[capacity];
    }

    @Override
    public boolean add(E item) {
        ensureCapacity(size + 1);
        array[size++] = item;
        return true;
    }

    @Override
    public void add(int index, E item) {
        checkIndexForAdd(index);
        ensureCapacity(size + 1);
        System.arraycopy(array, index, array, index + 1, size - index);
        array[index] = item;
        size++;
    }

    @Override
    public boolean addAll(List<E> otherList) {
        ensureCapacity(size + otherList.size());
        boolean result = false;
        for (int i = 0; i < otherList.size(); i++) {
            add(otherList.get(i));
            result = true;
        }
        return result;
    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            array[i] = null; // Help garbage collection
        }
        size = 0;
    }

    @Override
    public boolean contains(E item) {
        return indexOf(item) >= 0;
    }

    @Override
    public E get(int index) {
        checkIndex(index);
        return array[index];
    }

    @Override
    public int indexOf(E item) {
        for (int i = 0; i < size; i++) {
            if (item == null ? array[i] == null : item.equals(array[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public E remove(int index) {
        checkIndex(index);
        E oldValue = array[index];
        int numMoved = size - index - 1;
        if (numMoved > 0) {
            System.arraycopy(array, index + 1, array, index, numMoved);
        }
        array[--size] = null; // Clear to let GC do its work
        return oldValue;
    }

    @Override
    public boolean remove(E item) {
        int index = indexOf(item);
        if (index >= 0) {
            remove(index);
            return true;
        }
        return false;
    }

    @Override
    public E set(int index, E item) {
        checkIndex(index);
        E oldValue = array[index];
        array[index] = item;
        return oldValue;
    }

    @Override
    public int size() {
        return size;
    }

    public void ensureCapacity(int minCapacity) {
        if (minCapacity - array.length > 0) {
            int newCapacity = array.length * 2 + (array.length >> 1);
            if (newCapacity - minCapacity < 0) {
                newCapacity = minCapacity;
            }
            array = java.util.Arrays.copyOf(array, newCapacity);
        }
    }


    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    private void checkIndexForAdd(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; i < size; i++) {
            sb.append(array[i]);
            if (i < size - 1) sb.append(", ");
        }
        sb.append(']');
        return sb.toString();
    }

    @Override
    public void addFirst(E item) {
        add(0, item);
    }

    @Override
    public void addLast(E item) {
        add(size(), item);
    }

    @Override
    public E getFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return get(0);
    }

    @Override
    public E getLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return get(size() - 1);
    }

    @Override
    public E removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return remove(0);
    }

    @Override
    public E removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return remove(size() - 1);
    }

    @SuppressWarnings("unchecked")
    public ArrayList(List<E> otherList) {
        array = (E[]) new Object[otherList.size()];
        for (int i = 0; i < otherList.size(); i++) {
            array[i] = otherList.get(i);
        }
        size = otherList.size();
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ArrayList)) {
            return false;
        }
        ArrayList<?> otherList = (ArrayList<?>) other;
        if (this.size != otherList.size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!array[i].equals(otherList.array[i])) {
                return false;
            }
        }
        return true;
    }


}
