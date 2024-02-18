package utils;

public class SinglyLinkedList<T> {

    private Node<T> first;
    private int size;

    public SinglyLinkedList() {
        first = null;
        size = 0;
    }

    public boolean add(T item) {
        append(item);
        return true;
    }

    public void add(int index, T item) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        if (index == 0) {
            first = new Node<>(item, first);
        } else {
            Node<T> nodeBefore = node(index - 1);
            nodeBefore.next = new Node<>(item, nodeBefore.next);
        }
        size++;
    }

    private void append(T item) {
        if (isEmpty()) {
            first = new Node<>(item);
        } else {
            Node<T> current = first;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node<>(item);
        }
        size++;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    public T get(int index) {
        checkIndex(index);
        return node(index).data;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private Node<T> node(int index) {
        Node<T> current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    public T remove(int index) {
        checkIndex(index);
        T removedData;
        if (index == 0) {
            removedData = first.data;
            first = first.next;
        } else {
            Node<T> prev = node(index - 1);
            removedData = prev.next.data;
            prev.next = prev.next.next;
        }
        size--;
        return removedData;
    }

    public T set(int index, T item) {
        checkIndex(index);
        Node<T> targetNode = node(index);
        T oldData = targetNode.data;
        targetNode.data = item;
        return oldData;
    }

    public int size() {
        return size;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node<T> current = first;
        while (current != null) {
            sb.append(current.data);
            if (current.next != null) {
                sb.append(", ");
            }
            current = current.next;
        }
        sb.append("]");
        return sb.toString();
    }

    private static class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }

        public Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }
    }
}
