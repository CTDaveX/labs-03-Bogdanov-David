package utils;

import java.util.NoSuchElementException;

public class LinkedList<E> implements List<E> {
    private Node<E> first;
    private Node<E> last;
    private int size;

    public LinkedList() {
        first = null;
        last = null;
        size = 0;
    }

    public LinkedList(List<E> otherList) {
        this();
        addAll(otherList);
    }

    public LinkedList(LinkedList<E> otherList) {
        this();
        addAll(otherList);
    }

    public boolean add(E item) {
        append(item);
        size++;
        return true;
    }

    public void add(int index, E item) {
        checkIndexForAdd(index);
        if (index == size) {
            append(item);
        } else {
            insertBefore(index, item);
        }
        size++;
    }

    private void append(E item) {
        Node<E> newNode = new Node<>(last, item, null);
        if (last == null) {
            first = newNode;
        } else {
            last.next = newNode;
        }
        last = newNode;
    }

    private void checkIndexForAdd(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    public boolean contains(E item) {
        return indexOf(item) != -1;
    }

    public void clear() {
        first = null;
        last = null;
        size = 0;
    }

    private E detach(int index) {
        Node<E> target = node(index);
        E item = target.data;
        if (target.prev != null) {
            target.prev.next = target.next;
        } else {
            first = target.next;
        }
        if (target.next != null) {
            target.next.prev = target.prev;
        } else {
            last = target.prev;
        }
        size--;
        return item;
    }

    public E get(int index) {
        checkIndex(index);
        return node(index).data;
    }

    public int indexOf(E item) {
        int index = 0;
        for (Node<E> x = first; x != null; x = x.next) {
            if (item.equals(x.data)) {
                return index;
            }
            index++;
        }
        return -1;
    }

    private void insertBefore(int index, E item) {
        if (index == 0) {
            Node<E> newNode = new Node<>(null, item, first);
            if (first != null) {
                first.prev = newNode;
            } else {
                last = newNode;
            }
            first = newNode;
        } else {
            Node<E> prevNode = node(index - 1);
            Node<E> newNode = new Node<>(prevNode, item, prevNode.next);
            if (prevNode.next != null) {
                prevNode.next.prev = newNode;
            } else {
                last = newNode;
            }
            prevNode.next = newNode;
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private Node<E> node(int index) {
        Node<E> x;
        if (index < (size >> 1)) {
            x = first;
            for (int i = 0; i < index; i++) {
                x = x.next;
            }
        } else {
            x = last;
            for (int i = size - 1; i > index; i--) {
                x = x.prev;
            }
        }
        return x;
    }

    public E remove(int index) {
        checkIndex(index);
        return detach(index);
    }

    public boolean remove(E item) {
        for (Node<E> x = first; x != null; x = x.next) {
            if (item.equals(x.data)) {
                detach(indexOf(item));
                return true;
            }
        }
        return false;
    }

    public E set(int index, E item) {
        checkIndex(index);
        Node<E> target = node(index);
        E oldData = target.data;
        target.data = item;
        return oldData;
    }

    public int size() {
        return size;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (Node<E> x = first; x != null; x = x.next) {
            sb.append(x.data);
            if (x.next != null) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    // Additional methods
    public void addFirst(E item) {
        add(0, item);
    }

    public void addLast(E item) {
        add(size, item);
    }

    public E getFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return first.data;
    }

    public E getLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return last.data;
    }

    public E removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return remove(0);
    }

    public E removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return remove(size - 1);
    }

    @Override
    public boolean addAll(List<E> otherList) {
        boolean changed = false;
        for (int i = 0; i < otherList.size(); i++) {
            add(otherList.get(i));
            changed = true;
        }
        return changed;
    }

    private static class Node<E> {
        E data;
        Node<E> next;
        Node<E> prev;

        public Node(Node<E> prev, E data, Node<E> next) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LinkedList<?> other = (LinkedList<?>) obj;
        if (size != other.size) {
            return false;
        }
        Node<E> current = first;
        Node<?> otherCurrent = other.first;
        while (current != null) {
            if (!current.data.equals(otherCurrent.data)) {
                return false;
            }
            current = current.next;
            otherCurrent = otherCurrent.next;
        }
        return true;
    }

    public Iterator<E> iterator() {
        return new LinkedIterator();
    }

    private class LinkedIterator implements Iterator<E> {
        private Node<E> current;
        private Node<E> previous;

        public LinkedIterator() {
            current = first;
            previous = null;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            E result = current.data;
            previous = current;
            current = current.next;
            return result;
        }

        @Override
        public void remove() {
            if (previous == null) {
                throw new IllegalStateException();
            }
            LinkedList.this.remove(previous.data);
            previous = null;
        }
    }

}
